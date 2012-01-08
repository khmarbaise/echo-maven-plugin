import java.io.*
import java.util.*

void checkExistenceAndContentOfAFile(file, contents) {
	if (!file.canRead()) {
		throw new FileNotFoundException( "Could not find the " + file);
	}

	def lines_to_check_in_unix_script_marker = [:];
	(1..contents.size()).each {
		index -> lines_to_check_in_unix_script_marker[index] = false
	}
	
	file.eachLine {
		file_content, file_line -> contents.eachWithIndex {
			contents_expected, index -> if (file_content.equals(contents_expected)) {
				lines_to_check_in_unix_script_marker[index] = true;
			}
		}
	}

	contents.eachWithIndex {
		value, index -> if ( lines_to_check_in_unix_script_marker[index] == false ) {
			throw new Exception("The expected content in " + file + " couldn't be found." + contents[index]);
		}
	}
}

checkExistenceAndContentOfAFile(new File(basedir, "build.log"), [
	'[INFO] This message is very early in the build process.',
	'[INFO] This is line Nr. 1',
	'[INFO] This is line Nr. 2',
	'[INFO] This is line Nr. 3',
	'[WARNING] Warning: This is line Nr. 1',
	'[WARNING] Warning: This is line Nr. 2',
	'[WARNING] Warning: This is line Nr. 3',
	'[ERROR] ERROR: This is line Nr. 1',
	'[ERROR] ERROR: This is line Nr. 2',
	'[ERROR] ERROR: This is line Nr. 3',
	])

return true;
