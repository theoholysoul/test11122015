
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
object addClimateServices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[metadata.ClimateService],play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(climateServiceForm: play.data.Form[metadata.ClimateService]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*21.2*/scripts/*21.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
	<script src='"""),_display_(Seq[Any](/*22.16*/routes/*22.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*22.62*/("""'></script>
""")))};
Seq[Any](format.raw/*18.63*/("""
"""),format.raw/*20.1*/("""
"""),format.raw/*23.2*/("""

"""),_display_(Seq[Any](/*25.2*/main("Climate Services", scripts)/*25.35*/ {_display_(Seq[Any](format.raw/*25.37*/("""
	
	"""),_display_(Seq[Any](/*27.3*/flash_message())),format.raw/*27.18*/("""    
     """),_display_(Seq[Any](/*28.7*/if(true)/*28.15*/{_display_(Seq[Any](format.raw/*28.16*/("""
	    <h1>Add a new climate service</h1>
		
    	<h4>Add Workflow Metadata</h3>
    	<br>
        <div class="form-group">
            <label>Name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Workflow name">
        </div>
        <div class="form-group">
            <label>Description</label>
            <input type="text" class="form-control" id="purpose" name="purpose" placeholder="Workflow description">
        </div>
        <div class="form-group">
            <label>image</label>
            <input type="text" class="form-control" id="url" name="url" placeholder="image url">
        </div>
        <div class="form-group">
            <label>component</label>
            <input type="text" class="form-control" id="scenario" name="scenario" placeholder="Workflow component">
        </div>
        <div class="form-group">
            <label>input</label>
            <input type="text" class="form-control" id="version" name="version" placeholder="input">
        </div>
        <div class="form-group">
            <label>output</label>
            <input type="text" class="form-control" id="rootServiceId" name="rootServiceId" placeholder="output">
        </div>
        <div class="form-group">
            <label>Contributors</label>
            <input type="text" class="form-control" id="homepage" placeholder="Contributors">
        </div>
        <div class="form-group">
            <label>tag</label>
            <input type="text" class="form-control" id="delevopers" placeholder="tags">
        </div>
        <div class="form-group">
            <label>link</label>
            <input type="text" class="form-control" id="delevopers" placeholder="links">
        </div>   
        <div class="form-group">
            <label>instruction</label>
            <input type="text" class="form-control" id="delevopers" placeholder="instructions">
        </div> 	
        <div class="form-group">
            <label>dataset</label>
            <input type="text" class="form-control" id="delevopers" placeholder="datasets">
        </div> 		
        <div class="text-center">
        	<div class="form-group">            
            	<button type="reset" class="btn btn-success">Reset</button>
				<button type="button" class="btn btn-primary" onclick="Javascript:addWorkflow()">Add Workflow</button>
           	</div>
           </div>
        </div>
		
		
	    """),format.raw/*116.5*/("""
	
		<br>
		    
	    """),_display_(Seq[Any](/*120.7*/form(routes.ClimateServiceController.downloadClimateService(), 'class -> "form-horizontal", 'role -> "form")/*120.115*/ {_display_(Seq[Any](format.raw/*120.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*123.7*/("""
    """)))})),format.raw/*124.6*/("""
""")))})),format.raw/*125.2*/("""
"""))}
    }
    
    def render(climateServiceForm:play.data.Form[metadata.ClimateService]): play.api.templates.HtmlFormat.Appendable = apply(climateServiceForm)
    
    def f:((play.data.Form[metadata.ClimateService]) => play.api.templates.HtmlFormat.Appendable) = (climateServiceForm) => apply(climateServiceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 06 11:06:06 PST 2015
                    SOURCE: /Users/Holysoul/Documents/Test/workflow-master/ApacheCMDA-Frontend/app/views/climate/addClimateServices.scala.html
                    HASH: 17529a2ec5072e8458a24ea25f83fe4393227d7e
                    MATRIX: 3223->1205|3378->1286|3393->1293|3478->1297|3530->1313|3545->1319|3607->1359|3660->1266|3688->1284|3716->1372|3754->1375|3796->1408|3836->1410|3876->1415|3913->1430|3959->1441|3976->1449|4015->1450|6483->4800|6542->4823|6661->4931|6703->4933|6824->5022|6862->5028|6896->5030
                    LINES: 56->18|59->21|59->21|61->21|62->22|62->22|62->22|64->18|65->20|66->23|68->25|68->25|68->25|70->27|70->27|71->28|71->28|71->28|129->116|133->120|133->120|133->120|136->123|137->124|138->125
                    -- GENERATED --
                */
            