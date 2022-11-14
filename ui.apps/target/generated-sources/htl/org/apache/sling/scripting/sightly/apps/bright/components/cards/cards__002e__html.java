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
package org.apache.sling.scripting.sightly.apps.bright.components.cards;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class cards__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_cards = null;
Object _global_template = null;
_global_cards = renderContext.call("use", com.adobe.aem.guides.bright.core.models.Cards.class.getName(), obj());
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("\r\n<div class=\"cardsDesign\">\r\n  <div class=\"cards-left\">");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_global_cards, "cardsImage");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<img");
        {
            Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_global_cards, "cardsImage");
            {
                Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "uri");
                {
                    boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
                    if (var_shoulddisplayattr4) {
                        out.write(" src");
                        {
                            boolean var_istrueattr3 = (var_attrvalue1.equals(true));
                            if (!var_istrueattr3) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent2));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" alt=\"cards-img\"/>");
    }
}
out.write("</div>\r\n  <div class=\"cards-right\">\r\n    <div class=\"cards-info\">\r\n      ");
{
    Object var_testvariable5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_cards, "cardsTitle"), "html");
    if (renderContext.getObjectModel().toBoolean(var_testvariable5)) {
        out.write("<h4 class=\"cards-title\">");
        {
            Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_cards, "cardsTitle"), "html");
            out.write(renderContext.getObjectModel().toString(var_6));
        }
        out.write("</h4>");
    }
}
out.write("\r\n      ");
{
    Object var_testvariable7 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_cards, "cardsDesc"), "html");
    if (renderContext.getObjectModel().toBoolean(var_testvariable7)) {
        out.write("<p class=\"cards-decsription\">");
        {
            Object var_8 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_cards, "cardsDesc"), "html");
            out.write(renderContext.getObjectModel().toString(var_8));
        }
        out.write("</p>");
    }
}
out.write("\r\n    </div>\r\n  </div>\r\n</div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

