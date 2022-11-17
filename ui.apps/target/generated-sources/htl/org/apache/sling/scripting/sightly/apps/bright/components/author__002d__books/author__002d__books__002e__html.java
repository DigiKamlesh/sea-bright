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
package org.apache.sling.scripting.sightly.apps.bright.components.author__002d__books;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class author__002d__books__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_books = null;
Collection var_collectionvar1_list_coerced$ = null;
Collection var_collectionvar14_list_coerced$ = null;
Collection var_collectionvar28_list_coerced$ = null;
_global_books = renderContext.call("use", com.adobe.aem.guides.bright.core.models.AuthorBooks.class.getName(), obj());
out.write("<div>\n    <h1>");
{
    String var_0 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_books, "authorName"), "text")) + " Books");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h1>\n    ===================Multifield with single field=============\n    ");
{
    Object var_collectionvar1 = renderContext.getObjectModel().resolveProperty(_global_books, "authorBooks");
    {
        long var_size2 = ((var_collectionvar1_list_coerced$ == null ? (var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1)) : var_collectionvar1_list_coerced$).size());
        {
            boolean var_notempty3 = (var_size2 > 0);
            if (var_notempty3) {
                {
                    long var_end6 = var_size2;
                    {
                        boolean var_validstartstepend7 = (((0 < var_size2) && true) && (var_end6 > 0));
                        if (var_validstartstepend7) {
                            out.write("<div>");
                            if (var_collectionvar1_list_coerced$ == null) {
                                var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1);
                            }
                            long var_index8 = 0;
                            for (Object item : var_collectionvar1_list_coerced$) {
                                {
                                    long itemlist_field$_count = (renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.ADD.eval(var_index8, 1)).longValue());
                                    {
                                        boolean var_traversal10 = (((var_index8 >= 0) && (var_index8 <= var_end6)) && true);
                                        if (var_traversal10) {
                                            {
                                                String var_11 = (("\n         ---------------Book : " + renderContext.getObjectModel().toString(renderContext.call("xss", itemlist_field$_count, "text"))) + "--------------\n        ");
                                                out.write(renderContext.getObjectModel().toString(var_11));
                                            }
                                            out.write("<p> Book : <b>");
                                            {
                                                String var_12 = (renderContext.getObjectModel().toString(renderContext.call("xss", item, "text")) + " ");
                                                out.write(renderContext.getObjectModel().toString(var_12));
                                            }
                                            out.write("</b></p>\n    ");
                                        }
                                    }
                                }
                                var_index8++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar1_list_coerced$ = null;
}
out.write("\n    <p> ALL Book : <b>");
{
    Object var_13 = renderContext.call("xss", renderContext.call("join", renderContext.getObjectModel().resolveProperty(_global_books, "authorBooks"), ", "), "text");
    out.write(renderContext.getObjectModel().toString(var_13));
}
out.write("</b></p>\n\n    ========================== USING MAP ================================\n    ");
{
    Object var_collectionvar14 = renderContext.getObjectModel().resolveProperty(_global_books, "bookDetailsWithMap");
    {
        long var_size15 = ((var_collectionvar14_list_coerced$ == null ? (var_collectionvar14_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar14)) : var_collectionvar14_list_coerced$).size());
        {
            boolean var_notempty16 = (var_size15 > 0);
            if (var_notempty16) {
                {
                    long var_end19 = var_size15;
                    {
                        boolean var_validstartstepend20 = (((0 < var_size15) && true) && (var_end19 > 0));
                        if (var_validstartstepend20) {
                            out.write("<div>");
                            if (var_collectionvar14_list_coerced$ == null) {
                                var_collectionvar14_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar14);
                            }
                            long var_index21 = 0;
                            for (Object item : var_collectionvar14_list_coerced$) {
                                {
                                    long itemlist_field$_count = (renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.ADD.eval(var_index21, 1)).longValue());
                                    {
                                        boolean var_traversal23 = (((var_index21 >= 0) && (var_index21 <= var_end19)) && true);
                                        if (var_traversal23) {
                                            {
                                                String var_24 = (("\n        ---------------Book : " + renderContext.getObjectModel().toString(renderContext.call("xss", itemlist_field$_count, "text"))) + "--------------\n        ");
                                                out.write(renderContext.getObjectModel().toString(var_24));
                                            }
                                            out.write("<p> Book : <b>");
                                            {
                                                String var_25 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "bookname"), "text")) + " ");
                                                out.write(renderContext.getObjectModel().toString(var_25));
                                            }
                                            out.write("</b></p>\n        <p> Subject : <b>");
                                            {
                                                Object var_26 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "booksubject"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_26));
                                            }
                                            out.write("</b> </p>\n        <p> Publish : <b>");
                                            {
                                                Object var_27 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "publishyear"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_27));
                                            }
                                            out.write("</b> </p>\n    ");
                                        }
                                    }
                                }
                                var_index21++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar14_list_coerced$ = null;
}
out.write("\n\n\n    ========================== USING BEAN ================================\n    ");
{
    Object var_collectionvar28 = renderContext.getObjectModel().resolveProperty(_global_books, "bookDetailsWithMap");
    {
        long var_size29 = ((var_collectionvar28_list_coerced$ == null ? (var_collectionvar28_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar28)) : var_collectionvar28_list_coerced$).size());
        {
            boolean var_notempty30 = (var_size29 > 0);
            if (var_notempty30) {
                {
                    long var_end33 = var_size29;
                    {
                        boolean var_validstartstepend34 = (((0 < var_size29) && true) && (var_end33 > 0));
                        if (var_validstartstepend34) {
                            if (var_collectionvar28_list_coerced$ == null) {
                                var_collectionvar28_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar28);
                            }
                            long var_index35 = 0;
                            for (Object item : var_collectionvar28_list_coerced$) {
                                {
                                    long itemlist_field$_count = (renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.ADD.eval(var_index35, 1)).longValue());
                                    {
                                        boolean var_traversal37 = (((var_index35 >= 0) && (var_index35 <= var_end33)) && true);
                                        if (var_traversal37) {
                                            out.write("<div>");
                                            {
                                                String var_38 = (("\n        ---------------Book : " + renderContext.getObjectModel().toString(renderContext.call("xss", itemlist_field$_count, "text"))) + "--------------\n        ");
                                                out.write(renderContext.getObjectModel().toString(var_38));
                                            }
                                            out.write("<p> Book : <b>");
                                            {
                                                String var_39 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "bookname"), "text")) + " ");
                                                out.write(renderContext.getObjectModel().toString(var_39));
                                            }
                                            out.write("</b></p>\n        <p> Subject : <b>");
                                            {
                                                Object var_40 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "booksubject"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_40));
                                            }
                                            out.write("</b> </p>\n        <p> Publish : <b>");
                                            {
                                                Object var_41 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "publishyear"), "text");
                                                out.write(renderContext.getObjectModel().toString(var_41));
                                            }
                                            out.write("</b> </p>\n    </div>\n");
                                        }
                                    }
                                }
                                var_index35++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar28_list_coerced$ = null;
}
out.write("\n</div>\n\n\n\n\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

