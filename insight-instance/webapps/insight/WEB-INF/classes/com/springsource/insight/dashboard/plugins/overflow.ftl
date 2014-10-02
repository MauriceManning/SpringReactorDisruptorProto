<#ftl strip_whitespace=true>
<#import "/insight-1.0.ftl" as insight />

<@insight.group label=operation.label if=operation.overflow_list??>
	<div>${operation.before}</div>
	<br/>
    <table border='0' cellspacing='0' cellpadding='3'>
    	<colgroup>
    		<col/>
    		<col/>
    		<col style="width: 30px;"/>
    		<col/>
    		<col style="width: 30px;"/>
    		<col/>
    	</colgroup>
        <tr style="background-color: #F9F9F9;">
            <td><b>#</b></td>
            <td><b>Operation Type</b></td>
            <td>&nbsp;</td>
            <td><b>Invocations Count</b></td>
            <td>&nbsp;</td>
            <td><b>Total Duration</b></td>
        </tr>
        <#list operation.overflow_list as iter>
        	<#if iter_index % 2 != 0>
                <tr style="background-color: #F9F9F9;">
        	<#else>
        	    <tr>
        	</#if>
                <td><b>${iter_index + 1}</b></td>
                <td>${iter['operation-type']}</td>
                <td>&nbsp;</td>
                <td class="numeric">${iter['total-invocations']}</td>
                <td>&nbsp;</td>
		        <#if iter['total-duration'] == 0>
                    <td class="numeric">&lt;1 ms</td>
        	    <#else>
        	        <td class="numeric">${iter['total-duration']} ms</td>
        	    </#if>
            </tr>
        </#list>
    </table>
    <br/>
    <div>${operation.after}</div>
</@insight.group>
