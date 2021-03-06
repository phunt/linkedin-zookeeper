/*
 * Copyright (c) 2010-2010 LinkedIn, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

spec = [
    name: 'linkedin-zookeeper',
    group: 'org.linkedin',
    version: '1.4.1',

    versions: [
      groovy: '1.7.5',
      linkedinUtils: '1.8.0',
      slf4j: '1.5.8' // to be compatible with grails 1.3.5
    ],

    // information about the build framework itself
    build: [
        type: "gradle",
        version: "0.9",
        uri: "http://gradle.artifactoryonline.com/gradle/distributions/gradle-0.9-all.zip",
        commands: [
            "snapshot": "gradle release",
            "release": "gradle -Prelease=true release"
        ]
    ]
]

spec.scmUrl = "git@github.com:linkedin/${spec.name}.git"

/**
 * External dependencies
 */
spec.external = [
  commonsCli: 'commons-cli:commons-cli:1.2',
  groovy: "org.codehaus.groovy:groovy:${spec.versions.groovy}",
  junit: 'junit:junit:4.4',
  linkedinUtilsCore: "org.linkedin:org.linkedin.util-core:${spec.versions.linkedinUtils}",
  linkedinUtilsGroovy: "org.linkedin:org.linkedin.util-groovy:${spec.versions.linkedinUtils}",
  log4j: 'log4j:log4j:1.2.16',
  slf4j: "org.slf4j:slf4j-api:${spec.versions.slf4j}",
  slf4jLog4j: "org.slf4j:slf4j-log4j12:${spec.versions.slf4j}",
  slf4jJul: "org.slf4j:jul-to-slf4j:${spec.versions.slf4j}",
  zookeeper: 'org.apache.zookeeper:zookeeper:3.3.3'
]
