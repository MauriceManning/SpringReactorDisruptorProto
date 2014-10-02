<#ftl strip_whitespace=true>
<#import "/insight-1.0.ftl" as insight />
 
<@insight.group label="Class loader information" if=operation.classLoader??>
        <@insight.group collection=operation.classLoader?keys ; key>
            <@insight.entry name=key value=operation.classLoader[key] />
        </@insight.group>
</@insight.group>

<@insight.group label="Stack trace" if=operation.stackTrace??>
    <table border='0' cellspacing='0' cellpadding='3'>
        <tr>
            <td><b>#</b></td>
            <td><b>class</b></td>
            <td><b>method</b></td>
            <td><b>line</b></td>
        </tr>
        <#list operation.stackTrace as stackFrame>
            <tr>
                <td>${stackFrame_index}</td>
                <td>${stackFrame['className']}</td>
                <td>${stackFrame['methodName']}</td>
                <td>${stackFrame['lineNumber']}</td>
            </tr>
        </#list>
    </table>
</@insight.group>
