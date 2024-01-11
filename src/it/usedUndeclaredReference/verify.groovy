/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

def analysis = new File( basedir, 'target/analysis.txt' ).text

def expected = '''
UsedDeclaredArtifacts:

UsedUndeclaredArtifactsWithClasses:
 xml-apis:xml-apis:jar:1.0.b2:compile
  org.apache.xmlcommons.Version

UnusedDeclaredArtifacts:
 dom4j:dom4j:jar:1.6.1:compile

TestArtifactsWithNonTestScope:
'''

assert analysis == expected