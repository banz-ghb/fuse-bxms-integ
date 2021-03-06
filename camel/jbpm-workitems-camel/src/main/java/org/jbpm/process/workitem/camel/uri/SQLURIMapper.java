/*
 * Copyright 2016 Red Hat Inc. and/or its affiliates and other contributors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.process.workitem.camel.uri;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class SQLURIMapper extends URIMapper {
    // sql:select * from table where id=# order by name[?options]

    public SQLURIMapper() {
        super("sql");
    }

    @Override
    public URI toURI(Map<String, Object> options) throws URISyntaxException {
        String query = (String)options.get("query");
        options.remove("query");

        String path = query;
        return prepareCamelUri(path, options);
    }

}
