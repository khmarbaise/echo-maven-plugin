/**
 * The Maven Echo Plugin
 *
 * Copyright (c) 2012 by SoftwareEntwicklung Beratung Schulung (SoEBeS)
 * Copyright (c) 2012 by Karl Heinz Marbaise
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.soebes.maven.plugins.echo;

import java.util.List;

import org.apache.maven.plugin.MojoExecutionException;


/**
 * @goal echo
 * @author <a href="mailto:kama@soebes.de">Karl Heinz Marbaise</a>
 * @threadsafe
 */
public class EchoMojo extends AbstractEchoPlugIn {

	/**
	 * The different levels 
	 * which exist to printout the echos.
	 */
	public enum LogLevels {
		INFO,
		WARNING,
		ERROR,
		DEBUG,
	}
	
	/**
	 * This will define in which logging level 
	 * the given messages will be printed out.
	 * Their exist the following logging levels:
	 * <ul>
	 * <li>INFO</li>
	 * <li>WARNING</li>
	 * <li>ERROR<li>
	 * <li>DEBUG<li>
	 * </ul>
	 * 
	 * @parameter default-value="INFO"
	 * @required
	 */
	private LogLevels logLevel;
	
	/**
	 * The messages you would like to print out.
	 * 
	 * <pre>
	 *    ..
	 *    &lt;configuration&gt;
	 *      &lt;echos&gt;
	 *        &lt;echo&gt;Message Line Nr. 1&lt;/echo&gt;
	 *        &lt;echo&gt;Message Line Nr. 2&lt;/echo&gt;
	 *      &lt;/echos&gt;
	 *    &lt;/configuration&gt;
	 *    ..
	 * </pre>
	 *
     * @parameter
     * @required
     */
    private List<String> echos;

    /* (non-Javadoc)
     * @see org.apache.maven.plugin.Mojo#execute()
     */
    public void execute() throws MojoExecutionException {
    	for (String item : echos) {
    		switch (logLevel) {
			case DEBUG:
				getLog().debug(item);
				break;
			case ERROR:
				getLog().error(item);
				break;
			case INFO:
				getLog().info(item);
				break;
			case WARNING:
				getLog().warn(item);
				break;
    		}
		}
    }

}
