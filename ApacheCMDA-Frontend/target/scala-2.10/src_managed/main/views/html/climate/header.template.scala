
package views.html.climate

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more           *
* contributor license agreements.  See the NOTICE file distributed with       *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*                                                                               *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.                                               *
*******************************************************************************/
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more           *
* contributor license agreements.  See the NOTICE file distributed with       *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*                                                                               *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.                                               *
*******************************************************************************/
    def apply/*18.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*18.4*/("""
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
            </button>
            <a class="navbar-brand" style="padding-bottom: 0;" href="/climate"><img
                    src='"""),_display_(Seq[Any](/*29.27*/routes/*29.33*/.Assets.at("images/NASA_JPL_logo.png"))),format.raw/*29.71*/("""'
                    style="height: 40px; width: 220px;">&nbsp&nbsp<img
                    src='"""),_display_(Seq[Any](/*31.27*/routes/*31.33*/.Assets.at("images/logo.png"))),format.raw/*31.62*/("""' style="height: 15px; width: 250px;"></a>
        </div>
        <div class="navbar-collapse collapse" style="height:">
            <ul class="nav navbar-nav navbar-right">

                <li class="dropdown"><a href="#"
                class="dropdown-toggle" data-toggle="dropdown">Workflow<b
                class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*41.39*/routes/*41.45*/.WorkflowController.workflows())),format.raw/*41.76*/("""">Workflow List</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*42.39*/routes/*42.45*/.ClimateServiceController.climateServices())),format.raw/*42.88*/("""">Create Workflow</a></li>


                    </ul>

                </li>

                <li class="dropdown"><a href="#" href="addClimateServices.scala.html" title="addClimateServices"
                                        class="dropdown-toggle" data-toggle="dropdown">Tag<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">

                        <li><a href=""""),_display_(Seq[Any](/*54.39*/routes/*54.45*/.TagController.tags())),format.raw/*54.66*/("""">Tag List</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*55.39*/routes/*55.45*/.ClimateServiceController.climateServices())),format.raw/*55.88*/("""">Create Tag</a></li>


                    </ul>

                </li>
                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">Workflow<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(Seq[Any](/*65.39*/routes/*65.45*/.DatasetController.datasetList())),format.raw/*65.77*/("""">Workflow List</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*66.39*/routes/*66.45*/.DatasetController.searchDataset())),format.raw/*66.79*/("""">Create Workflow</a></li>
						
                    </ul>
                </li>
                """),format.raw/*71.52*/("""
                                        """),format.raw/*72.101*/("""
                    """),format.raw/*73.47*/("""
                    """),format.raw/*75.49*/("""
                        """),format.raw/*78.27*/("""
                        """),format.raw/*81.27*/("""
                        """),format.raw/*84.23*/("""
                    """),format.raw/*87.19*/("""

                <li class="dropdown"><a href="#"
                                        class="dropdown-toggle" data-toggle="dropdown">About<b
                        class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href=""""),_display_(Seq[Any](/*93.39*/routes/*93.45*/.ClimateServiceController.home())),format.raw/*93.77*/("""">Home</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*94.39*/routes/*94.45*/.AboutusController.aboutUs())),format.raw/*94.73*/("""">About Us</a></li>
                        <li><a href=""""),_display_(Seq[Any](/*95.39*/routes/*95.45*/.AboutusController.aboutProject())),format.raw/*95.78*/("""">About project</a></li>
                    </ul>
                </li>

            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 12 17:14:45 PST 2015
                    SOURCE: /Users/Holysoul/Documents/Test/workflow-master/ApacheCMDA-Frontend/app/views/climate/header.scala.html
                    HASH: f48a7e72ec3b818f7af4260f29258a81a0d29ed5
                    MATRIX: 3339->1288|3435->1290|4066->1885|4081->1891|4141->1929|4276->2028|4291->2034|4342->2063|4801->2486|4816->2492|4869->2523|4968->2586|4983->2592|5048->2635|5502->3053|5517->3059|5560->3080|5654->3138|5669->3144|5734->3187|6122->3539|6137->3545|6191->3577|6290->3640|6305->3646|6361->3680|6487->3832|6557->3933|6606->3980|6655->4052|6708->4220|6761->4393|6814->4469|6863->4533|7177->4811|7192->4817|7246->4849|7336->4903|7351->4909|7401->4937|7495->4995|7510->5001|7565->5034
                    LINES: 56->18|59->18|70->29|70->29|70->29|72->31|72->31|72->31|82->41|82->41|82->41|83->42|83->42|83->42|95->54|95->54|95->54|96->55|96->55|96->55|106->65|106->65|106->65|107->66|107->66|107->66|111->71|112->72|113->73|114->75|115->78|116->81|117->84|118->87|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|126->95
                    -- GENERATED --
                */
            