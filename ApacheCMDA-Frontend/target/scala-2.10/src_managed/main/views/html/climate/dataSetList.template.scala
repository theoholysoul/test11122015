
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
object dataSetList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[DataSet],play.data.Form[DataSet],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(dataSets: List[DataSet], dataSetForm: play.data.Form[DataSet]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*22.2*/scripts/*22.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
	<script src='"""),_display_(Seq[Any](/*23.16*/routes/*23.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*23.62*/("""'></script>
	<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""
		//alert($("#url").text());
	"""),format.raw/*27.2*/("""}"""),format.raw/*27.3*/(""");
	</script>
""")))};
Seq[Any](format.raw/*18.65*/("""

"""),format.raw/*21.1*/("""
"""),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main("Dataset List", scripts)/*31.31*/ {_display_(Seq[Any](format.raw/*31.33*/("""
	
	"""),_display_(Seq[Any](/*33.3*/flash_message())),format.raw/*33.18*/("""   
	 
    <h1>Workflow List</h1>
    <h3>"""),_display_(Seq[Any](/*36.10*/dataSets/*36.18*/.size())),format.raw/*36.25*/(""" Workflow Found</h3>
    <div style="overflow-y:scroll">

		<table class="table table-striped table-bordered table-condensed tablesorter" id ="myTable">
		<thead>
	<tr >
		<th style = "vertical-align: top;" class="col-md-1 header">Id</th>
		<th style = "vertical-align: top;" class="col-md-2">Workflow Name</th>
		<th style = "vertical-align: top;" class="col-md-1">Description</th>
		<th style = "vertical-align: top;" class="col-md-1">Component</th>
		<th style = "vertical-align: top;" class="col-md-2">Input and Output</th>
		<th style = "vertical-align: top;" class="col-md-1">Contributor</th>
		<th style = "vertical-align: top;" class="col-md-1">Tags</th>
		<th style = "vertical-align: top;" class="col-md-1">Instruction</th>
		<th style = "vertical-align: top;" class="col-md-1">Dataset</th>
		<!--  
		<th style = "vertical-align: top;" class="col-md-3">Source</th> 
		<th style = "vertical-align: top;" class="col-md-3">Status</th>
		<th style = "vertical-align: top;" class="col-md-4">Responsible Person</th>
		<th style = "vertical-align: top;" class="col-md-4">Data Source Name in Web Interface</th> 
		-->
		"""),format.raw/*63.5*/("""
	</tr>
	</thead>
	<tbody>
	"""),_display_(Seq[Any](/*67.3*/for(dataSet <- dataSets) yield /*67.27*/{_display_(Seq[Any](format.raw/*67.28*/("""
	<tr>
		<td><font size="2">"""),_display_(Seq[Any](/*69.23*/dataSet/*69.30*/.getId())),format.raw/*69.38*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*70.23*/dataSet/*70.30*/.getDataSetName())),format.raw/*70.47*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*71.23*/dataSet/*71.30*/.getAgencyId())),format.raw/*71.44*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*72.23*/dataSet/*72.30*/.getInstrument())),format.raw/*72.46*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*73.23*/dataSet/*73.30*/.getPhysicalVariable())),format.raw/*73.52*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*74.23*/dataSet/*74.30*/.getCMIP5VarName())),format.raw/*74.48*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*75.23*/dataSet/*75.30*/.getUnits())),format.raw/*75.41*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*76.23*/dataSet/*76.30*/.getGridDimension())),format.raw/*76.49*/("""</font></td>
		<!--
		<td><font size="2">"""),_display_(Seq[Any](/*78.23*/dataSet/*78.30*/.getSource())),format.raw/*78.42*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*79.23*/dataSet/*79.30*/.getStatus())),format.raw/*79.42*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*80.23*/dataSet/*80.30*/.getResponsiblePerson())),format.raw/*80.53*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*81.23*/dataSet/*81.30*/.getDataSourceName())),format.raw/*81.50*/("""</font></td>
		-->
		<td><font size="2">"""),_display_(Seq[Any](/*83.23*/dataSet/*83.30*/.getVariableName())),format.raw/*83.48*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*84.23*/dataSet/*84.30*/.getDataSourceInput())),format.raw/*84.51*/("""</font></td>
		<!--<td><font size="2">"""),_display_(Seq[Any](/*85.27*/dataSet/*85.34*/.getVariableNameInput())),format.raw/*85.57*/("""</font></td> -->
		<td><font size="2">"""),_display_(Seq[Any](/*86.23*/dataSet/*86.30*/.getStartTime())),format.raw/*86.45*/("""</font></td>
		<td><font size="2">"""),_display_(Seq[Any](/*87.23*/dataSet/*87.30*/.getEndTime())),format.raw/*87.43*/("""</font></td>
		
	</tr>
	
	""")))})),format.raw/*91.3*/("""
	</tbody>
    </table>
    
 
    
    </div>
""")))})),format.raw/*98.2*/("""
"""))}
    }
    
    def render(dataSets:List[DataSet],dataSetForm:play.data.Form[DataSet]): play.api.templates.HtmlFormat.Appendable = apply(dataSets,dataSetForm)
    
    def f:((List[DataSet],play.data.Form[DataSet]) => play.api.templates.HtmlFormat.Appendable) = (dataSets,dataSetForm) => apply(dataSets,dataSetForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 06 11:15:59 PST 2015
                    SOURCE: /Users/Holysoul/Documents/Test/workflow-master/ApacheCMDA-Frontend/app/views/climate/dataSetList.scala.html
                    HASH: 593bbf32e742e76071ae1d842994fa2639ce9b01
                    MATRIX: 3214->1205|3371->1289|3386->1296|3471->1300|3523->1316|3538->1322|3600->1362|3702->1436|3731->1437|3789->1468|3817->1469|3872->1268|3901->1287|3929->1484|3967->1487|4005->1516|4045->1518|4085->1523|4122->1538|4201->1581|4218->1589|4247->1596|5397->3154|5461->3183|5501->3207|5540->3208|5605->3237|5621->3244|5651->3252|5722->3287|5738->3294|5777->3311|5848->3346|5864->3353|5900->3367|5971->3402|5987->3409|6025->3425|6096->3460|6112->3467|6156->3489|6227->3524|6243->3531|6283->3549|6354->3584|6370->3591|6403->3602|6474->3637|6490->3644|6531->3663|6609->3705|6625->3712|6659->3724|6730->3759|6746->3766|6780->3778|6851->3813|6867->3820|6912->3843|6983->3878|6999->3885|7041->3905|7118->3946|7134->3953|7174->3971|7245->4006|7261->4013|7304->4034|7379->4073|7395->4080|7440->4103|7515->4142|7531->4149|7568->4164|7639->4199|7655->4206|7690->4219|7748->4246|7827->4294
                    LINES: 56->18|59->22|59->22|61->22|62->23|62->23|62->23|64->25|64->25|66->27|66->27|69->18|71->21|72->29|74->31|74->31|74->31|76->33|76->33|79->36|79->36|79->36|100->63|104->67|104->67|104->67|106->69|106->69|106->69|107->70|107->70|107->70|108->71|108->71|108->71|109->72|109->72|109->72|110->73|110->73|110->73|111->74|111->74|111->74|112->75|112->75|112->75|113->76|113->76|113->76|115->78|115->78|115->78|116->79|116->79|116->79|117->80|117->80|117->80|118->81|118->81|118->81|120->83|120->83|120->83|121->84|121->84|121->84|122->85|122->85|122->85|123->86|123->86|123->86|124->87|124->87|124->87|128->91|135->98
                    -- GENERATED --
                */
            