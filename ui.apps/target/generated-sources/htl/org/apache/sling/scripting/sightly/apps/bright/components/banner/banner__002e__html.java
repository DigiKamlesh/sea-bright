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
package org.apache.sling.scripting.sightly.apps.bright.components.banner;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class banner__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_banner = null;
Object _global_template = null;
_global_banner = renderContext.call("use", com.adobe.aem.guides.bright.core.models.Banner.class.getName(), obj());
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("\n\n<div class=\"aem-GridColumn aem-GridColumn--default--12 backgroundImage\"");
{
    String var_attrcontent0 = (("background-image:url(" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_banner, "image"), "styleString"))) + ")");
    out.write(" style=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent0));
    out.write("\"");
}
out.write(">\n<div class=\"aem-GridColumn aem-GridColumn--default--6 bannerleft\"></div>\n<div class=\"aem-GridColumn aem-GridColumn--default--6 banner-right\">\n\t<div class=\"bannerInfo\">\n\t");
{
    Object var_testvariable1 = renderContext.getObjectModel().resolveProperty(_global_banner, "title");
    if (renderContext.getObjectModel().toBoolean(var_testvariable1)) {
        out.write("<h2 class=\"bannerTitle\">");
        {
            Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_banner, "title"), "text");
            out.write(renderContext.getObjectModel().toString(var_2));
        }
        out.write("</h2>");
    }
}
out.write("\n\t");
{
    Object var_testvariable3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_banner, "description"), "html");
    if (renderContext.getObjectModel().toBoolean(var_testvariable3)) {
        out.write("<h5 class=\"bannerDesc\">");
        {
            Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_banner, "description"), "html");
            out.write(renderContext.getObjectModel().toString(var_4));
        }
        out.write("</h5>");
    }
}
out.write("\n</div>\n</div>\n</div>\n\n\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

