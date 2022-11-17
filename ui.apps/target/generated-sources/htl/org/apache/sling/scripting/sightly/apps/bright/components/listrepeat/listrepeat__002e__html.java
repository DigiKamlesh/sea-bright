/*******************************************************************************
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
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.bright.components.listrepeat;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class listrepeat__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_books = null;
Collection var_collectionvar2_list_coerced$ = null;
Collection var_collectionvar13_list_coerced$ = null;
_global_books = renderContext.call("use", com.adobe.aem.guides.bright.core.models.AuthorBooks.class.getName(), obj());
out.write("\r\n    ");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_global_books, "AuthorName");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<h1>");
        {
            Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_books, "AuthorName"), "text");
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</h1>");
    }
}
out.write("\r\n    ");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_global_books, "authorBooks");
    {
        long var_size3 = ((var_collectionvar2_list_coerced$ == null ? (var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2)) : var_collectionvar2_list_coerced$).size());
        {
            boolean var_notempty4 = (var_size3 > 0);
            if (var_notempty4) {
                {
                    long var_end7 = var_size3;
                    {
                        boolean var_validstartstepend8 = (((0 < var_size3) && true) && (var_end7 > 0));
                        if (var_validstartstepend8) {
                            out.write("<div class=\"dataSlyList\">");
                            if (var_collectionvar2_list_coerced$ == null) {
                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                            }
                            long var_index9 = 0;
                            for (Object item : var_collectionvar2_list_coerced$) {
                                {
                                    boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                    if (var_traversal11) {
                                        out.write("\r\n        <p class=\"dataSlyListItem\"> Book : <b>");
                                        {
                                            String var_12 = (renderContext.getObjectModel().toString(renderContext.call("xss", item, "text")) + " ");
                                            out.write(renderContext.getObjectModel().toString(var_12));
                                        }
                                        out.write("</b></p>\r\n    ");
                                    }
                                }
                                var_index9++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar2_list_coerced$ = null;
}
out.write("\r\n    <div class=\"spacing\" style=\"margin-top: 50px; margin-bottom:50px;\"> <b>Data sly repeat</b></div>\r\n    ");
{
    Object var_collectionvar13 = renderContext.getObjectModel().resolveProperty(_global_books, "authorBooks");
    {
        long var_size14 = ((var_collectionvar13_list_coerced$ == null ? (var_collectionvar13_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar13)) : var_collectionvar13_list_coerced$).size());
        {
            boolean var_notempty15 = (var_size14 > 0);
            if (var_notempty15) {
                {
                    long var_end18 = var_size14;
                    {
                        boolean var_validstartstepend19 = (((0 < var_size14) && true) && (var_end18 > 0));
                        if (var_validstartstepend19) {
                            if (var_collectionvar13_list_coerced$ == null) {
                                var_collectionvar13_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar13);
                            }
                            long var_index20 = 0;
                            for (Object item : var_collectionvar13_list_coerced$) {
                                {
                                    boolean var_traversal22 = (((var_index20 >= 0) && (var_index20 <= var_end18)) && true);
                                    if (var_traversal22) {
                                        out.write("<div class=\"dataSlyRepeat\">\r\n        <p class=\"dataSlyRepeatItem\"> Book : <b>");
                                        {
                                            String var_23 = (renderContext.getObjectModel().toString(renderContext.call("xss", item, "text")) + " ");
                                            out.write(renderContext.getObjectModel().toString(var_23));
                                        }
                                        out.write("</b></p>\r\n    </div>\n");
                                    }
                                }
                                var_index20++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar13_list_coerced$ = null;
}
out.write("\r\n\r\n\r\n\r\n\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

