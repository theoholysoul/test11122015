
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
object climateServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.ClimateService],play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*19.2*/(climateServices: List[metadata.ClimateService], climateServiceForm: play.data.Form[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*23.2*/scripts/*23.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*23.13*/("""
	<script src='"""),_display_(Seq[Any](/*24.16*/routes/*24.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*24.62*/("""'></script>
	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*26.30*/("""{"""),format.raw/*26.31*/("""

	"""),format.raw/*28.2*/("""}"""),format.raw/*28.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*19.111*/("""

"""),format.raw/*22.1*/("""
"""),format.raw/*30.2*/("""

"""),_display_(Seq[Any](/*32.2*/main("Climate Services", scripts)/*32.35*/ {_display_(Seq[Any](format.raw/*32.37*/("""
	
	"""),_display_(Seq[Any](/*34.3*/flash_message())),format.raw/*34.18*/("""   
	 
    <h1>Create Tag</h1>

	"""),format.raw/*48.3*/("""

	<div class="ui-widget col-sm-offset-3 col-sm-7">
				<label>Name</label>
				<input type="text" class="form-control" id="name" name="name" placeholder="Workflow name">
				<label>Description</label>

				<input type="text" class="form-control" id="name" name="Description" placeholder="Description">

	<div class="text-center">
		<div class="form-group">
			<button type="reset" class="btn btn-success">Reset</button>
			<button type="button" class="btn btn-primary" onclick="Javascript:addWorkflow()">Add Tag</button>
		</div>
	</div>
	</div>


	"""),_display_(Seq[Any](/*66.3*/for(climateService <- climateServices) yield /*66.41*/{_display_(Seq[Any](format.raw/*66.42*/("""
	<tr>
		<td><a href = """"),_display_(Seq[Any](/*68.19*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*68.88*/(""""><font size="3">"""),_display_(Seq[Any](/*68.106*/climateService/*68.120*/.getClimateServiceName())),format.raw/*68.144*/("""</a></font></td>

		<td><span class=""""),_display_(Seq[Any](/*70.21*/climateService/*70.35*/.getClimateServiceName())),format.raw/*70.59*/(""" editable"  data-name='purpose'><font size="3">
				"""),_display_(Seq[Any](/*71.6*/climateService/*71.20*/.getPurpose())),format.raw/*71.33*/(""" </font></span></td>
		
		<td class = "text-center" ><span class=""""),_display_(Seq[Any](/*73.44*/climateService/*73.58*/.getClimateServiceName())),format.raw/*73.82*/(""" editable" id = "url" data-name='url'>
				<a href = """"),_display_(Seq[Any](/*74.17*/{routes.ClimateServiceController.oneService(climateService.getUrl())})),format.raw/*74.86*/(""""><img src='"""),_display_(Seq[Any](/*74.99*/climateService/*74.113*/.getPhoto())),format.raw/*74.124*/("""' style="height: 150px; width: 150px" ></a> </span></td>
	
	</tr>
	""")))})),format.raw/*77.3*/("""
    </table>
 
    
     """),_display_(Seq[Any](/*81.7*/if(false)/*81.16*/{_display_(Seq[Any](format.raw/*81.17*/("""
		    
	    """),_display_(Seq[Any](/*83.7*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*83.115*/ {_display_(Seq[Any](format.raw/*83.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*86.7*/("""
    """)))})),format.raw/*87.6*/("""
""")))})),format.raw/*88.2*/("""

"""))}
    }
    
    def render(climateServices:List[metadata.ClimateService],climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServices,climateServiceForm)
    
    def f:((List[metadata.ClimateService],play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServices,climateServiceForm) => apply(climateServices,climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 06 12:56:06 PST 2015
                    SOURCE: /Users/Holysoul/Documents/Test/workflow-master/ApacheCMDA-Frontend/app/views/climate/climateServices.scala.html
                    HASH: d6fe9ece1e28229d4b16c0a51530125eab335f78
                    MATRIX: 3250->1206|3453->1336|3468->1343|3553->1347|3605->1363|3620->1369|3682->1409|3784->1483|3813->1484|3843->1487|3871->1488|3927->1315|3956->1334|3984->1503|4022->1506|4064->1539|4104->1541|4144->1546|4181->1561|4241->1852|4827->2403|4881->2441|4920->2442|4981->2467|5072->2536|5127->2554|5151->2568|5198->2592|5272->2630|5295->2644|5341->2668|5429->2721|5452->2735|5487->2748|5590->2815|5613->2829|5659->2853|5750->2908|5841->2977|5890->2990|5914->3004|5948->3015|6047->3083|6109->3110|6127->3119|6166->3120|6215->3134|6333->3242|6374->3244|6494->3333|6531->3339|6564->3341
                    LINES: 56->19|59->23|59->23|61->23|62->24|62->24|62->24|64->26|64->26|66->28|66->28|69->19|71->22|72->30|74->32|74->32|74->32|76->34|76->34|80->48|98->66|98->66|98->66|100->68|100->68|100->68|100->68|100->68|102->70|102->70|102->70|103->71|103->71|103->71|105->73|105->73|105->73|106->74|106->74|106->74|106->74|106->74|109->77|113->81|113->81|113->81|115->83|115->83|115->83|118->86|119->87|120->88
                    -- GENERATED --
                */
            