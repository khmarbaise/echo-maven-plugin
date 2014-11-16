/**
 * The Maven Echo Plugin
 * 
 * Copyright (c) 2012 by SoftwareEntwicklung Beratung Schulung (SoEBeS)
 * Copyright (c) 2012 by Karl Heinz Marbaise
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
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
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author <a href="mailto:kama@soebes.de">Karl Heinz Marbaise</a>
 */
@Mojo( name = "format", requiresProject = true, threadSafe = true )
public class FormatMojo
    extends AbstractEchoPlugIn
{

    @Parameter( required = true )
    private List<String> echos;

    /*
     * (non-Javadoc)
     * @see org.apache.maven.plugin.Mojo#execute()
     */
    public void execute()
        throws MojoExecutionException
    {
        for ( String item : echos )
        {
        }
    }

}
