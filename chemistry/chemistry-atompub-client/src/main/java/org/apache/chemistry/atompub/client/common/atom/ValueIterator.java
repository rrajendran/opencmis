/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Authors:
 *     Bogdan Stefanescu, Nuxeo
 */
package org.apache.chemistry.atompub.client.common.atom;

import javax.xml.stream.XMLStreamException;

import org.apache.chemistry.atompub.CMIS;
import org.apache.chemistry.atompub.client.common.xml.ChildrenIterator;
import org.apache.chemistry.atompub.client.common.xml.StaxReader;

/**
 *
 */
public class ValueIterator extends ChildrenIterator<String> {

    public ValueIterator(StaxReader sr) throws XMLStreamException {
        super(sr);
    }

    @Override
    protected boolean accept() {
        return (reader.getLocalName().equals(CMIS.VALUE.getLocalPart()) && reader.getNamespaceURI().equals(
                CMIS.VALUE.getNamespaceURI()));
    }

    @Override
    protected String createValue() throws XMLStreamException {
        return reader.getElementText();
    }

}
