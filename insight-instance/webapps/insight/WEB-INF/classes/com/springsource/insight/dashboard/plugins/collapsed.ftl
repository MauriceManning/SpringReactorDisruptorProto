<#ftl strip_whitespace=true>
<#import "/insight-1.0.ftl" as insight />

<@insight.group label=operation.label >
	<div>${operation['collapsed-operation-desc']}</div>
	<br/>
    <table border='0' cellspacing='0' cellpadding='3'>
    	<colgroup>
    		<col style="width: 260px;"/>
    		<col/>
    		<col style="width: 100px;"/>
    	</colgroup>
        <tr style="background-color: #F9F9F9;">
            <td><b>Operation Type</b></td>
            <td>&nbsp;</td>
            <td><b>Invocations Count</b></td>
        </tr>
		<tr>        
	        <td>${operation['collapsed-operation-type']}</td>
	        <td>&nbsp;</td>
	        <td class="numeric">${operation['collapsed-invocations']}</td>
        </tr>
    </table>
    <br/>
    <div>${operation['collapsed-operation-help']}</div>
</@insight.group>
