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
package org.apache.sling.scripting.sightly.apps.bright.components.implicitobjects;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class implicitobjectsinsightly__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _dynamic_pageproperties = bindings.get("pageproperties");
Object _dynamic_inheritedpageproperties = bindings.get("inheritedpageproperties");
Object _dynamic_component = bindings.get("component");
Object _dynamic_componentcontext = bindings.get("componentcontext");
Object _dynamic_currentpage = bindings.get("currentpage");
Object _dynamic_currentdesign = bindings.get("currentdesign");
Object _dynamic_currentnode = bindings.get("currentnode");
Object _dynamic_resource = bindings.get("resource");
Object _dynamic_resourcepage = bindings.get("resourcepage");
Object _dynamic_resourcedesign = bindings.get("resourcedesign");
Object _dynamic_wcmmode = bindings.get("wcmmode");
out.write("<h1>HTL Global Objects</h1>\n<h2> 1)Enumerable Objects</h2>\n<p>");
{
    String var_0 = ("created By = " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "jcr:createdBy"), "text")));
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</p>\n<p>");
{
    String var_1 = ("Page Properties = " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_pageproperties, "jcr:title"), "text")));
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n<p>");
{
    String var_2 = ("Inherited Page Properties = " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_inheritedpageproperties, "jcr:title"), "text")));
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</p>\n<h2> 2)Java-Backed Objects</h2>\n<p>");
{
    String var_3 = ("component name = " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_component, "title"), "text")));
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</p>\n<p>");
{
    String var_4 = ("component context = " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_componentcontext, "page"), "title"), "text")));
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</p>\n==========================================================================================\n<p>");
{
    String var_5 = ("Current Page = " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "pageTitle"), "text")));
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p>\n<p>");
{
    String var_6 = ("Current Page Path = " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "path"), "text")));
    out.write(renderContext.getObjectModel().toString(var_6));
}
out.write("</p>\n<p>");
{
    String var_7 = ("Design Node = " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentdesign, "path"), "text")));
    out.write(renderContext.getObjectModel().toString(var_7));
}
out.write("</p>\n<p>");
{
    String var_8 = ("Current Node = " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentnode, "path"), "text")));
    out.write(renderContext.getObjectModel().toString(var_8));
}
out.write("</p>\n<p>");
{
    String var_9 = ("Depth of the Page= " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "depth"), "text")));
    out.write(renderContext.getObjectModel().toString(var_9));
}
out.write("</p>   \n<p>");
{
    String var_10 = ("Is that Page locked = " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "isLocked"), "text")));
    out.write(renderContext.getObjectModel().toString(var_10));
}
out.write("</p>");
{
    String var_11 = ("Resource = " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_resource, "path"), "text")));
    out.write(renderContext.getObjectModel().toString(var_11));
}
out.write("</p>\n<p>");
{
    String var_12 = ("Resource Page= " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_resourcepage, "path"), "text")));
    out.write(renderContext.getObjectModel().toString(var_12));
}
out.write("</p>\n<p>");
{
    String var_13 = ("Resource Design = " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_resourcedesign, "path"), "text")));
    out.write(renderContext.getObjectModel().toString(var_13));
}
out.write("</p>\n==========================================================================================\n<p>");
{
    String var_14 = ((("WCM-MODE -> EDIT/PREVIEW = " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit"), "text"))) + " / ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "preview"), "text")));
    out.write(renderContext.getObjectModel().toString(var_14));
}
out.write("</p>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

