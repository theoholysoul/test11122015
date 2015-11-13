
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
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
object workflow extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.Workflow],play.data.Form[metadata.Workflow],play.api.templates.HtmlFormat.Appendable] {

    /*******************************************************************************
* Licensed to the Apache Software Foundation (ASF) under one or more		   *
* contributor license agreements.  See the NOTICE file distributed with	   *
* this work for additional information regarding copyright ownership.         *
* The ASF licenses this file to You under the Apache License, Version 2.0     *
* (the "License"); you may not use this file except in compliance with        *
* the License.  You may obtain a copy of the License at                       *
*                                                                             *
*    http://www.apache.org/licenses/LICENSE-2.0                               *
*																			   *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.											   *
*******************************************************************************/
    def apply/*18.2*/(workflows: List[metadata.Workflow], workflowForm: play.data.Form[metadata.Workflow]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
  <script src='"""),_display_(Seq[Any](/*23.17*/routes/*23.23*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.63*/("""'></script>
  <script type="text/javascript">
          $(document).ready(function()"""),format.raw/*25.39*/("""{"""),format.raw/*25.40*/("""

          """),format.raw/*27.11*/("""}"""),format.raw/*27.12*/(""");
  </script>
""")))};
Seq[Any](format.raw/*18.87*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Climate Services", scripts)/*31.35*/ {_display_(Seq[Any](format.raw/*31.37*/("""

  """),_display_(Seq[Any](/*33.4*/flash_message())),format.raw/*33.19*/("""

  <h1>"""),_display_(Seq[Any](/*35.8*/workflows/*35.17*/.size())),format.raw/*35.24*/(""" Workflow List</h1>
  <table class="table table-striped table-bordered table-condensed ex2 tablesorter" id = "csTable">
    <thead>
      <tr>
        <th class="col-md-2">Workflow ID</td>
        <th class="col-md-4">Workflow Title</td>
        <th class="col-md-4">Workflow Description</td>


      </tr>
    </thead>
    """),_display_(Seq[Any](/*46.6*/for(workflow <- workflows) yield /*46.32*/{_display_(Seq[Any](format.raw/*46.33*/("""
      <tr>
        <td><a href = "#"><font size="3">"""),_display_(Seq[Any](/*48.43*/workflow/*48.51*/.getId())),format.raw/*48.59*/("""</a></font></td>

        <td><span class=""""),_display_(Seq[Any](/*50.27*/workflow/*50.35*/.getTitle())),format.raw/*50.46*/(""" editable"  data-name='purpose'><font size="3">
        """),_display_(Seq[Any](/*51.10*/workflow/*51.18*/.getTitle())),format.raw/*51.29*/(""" </font></span></td>

        <td><span class=""""),_display_(Seq[Any](/*53.27*/workflow/*53.35*/.getDescription())),format.raw/*53.52*/(""" editable"  data-name='purpose'><font size="3">
        """),_display_(Seq[Any](/*54.10*/workflow/*54.18*/.getDescription())),format.raw/*54.35*/(""" </font></span></td>

      </tr>
    """)))})),format.raw/*57.6*/("""
  </table>


""")))})))}
    }
    
    def render(workflows:List[metadata.Workflow],workflowForm:play.data.Form[metadata.Workflow]): play.api.templates.HtmlFormat.Appendable = apply(workflows,workflowForm)
    
    def f:((List[metadata.Workflow],play.data.Form[metadata.Workflow]) => play.api.templates.HtmlFormat.Appendable) = (workflows,workflowForm) => apply(workflows,workflowForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 12 17:06:40 PST 2015
                    SOURCE: /Users/Holysoul/Documents/Test/workflow-master/ApacheCMDA-Frontend/app/views/climate/workflow.scala.html
                    HASH: 2e8b0ab892dbd8fc8d473f09e92d507216e8fbcd
                    MATRIX: 3201->1189|3380->1295|3395->1302|3480->1306|3533->1323|3548->1329|3610->1369|3722->1453|3751->1454|3791->1466|3820->1467|3876->1274|3905->1293|3933->1483|3971->1486|4013->1519|4053->1521|4093->1526|4130->1541|4174->1550|4192->1559|4221->1566|4581->1891|4623->1917|4662->1918|4752->1972|4769->1980|4799->1988|4879->2032|4896->2040|4929->2051|5022->2108|5039->2116|5072->2127|5156->2175|5173->2183|5212->2200|5305->2257|5322->2265|5361->2282|5431->2321
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|78->35|78->35|78->35|89->46|89->46|89->46|91->48|91->48|91->48|93->50|93->50|93->50|94->51|94->51|94->51|96->53|96->53|96->53|97->54|97->54|97->54|100->57
                    -- GENERATED --
                */
            