<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/tlds/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tlds/struts-logic.tld" prefix="logic"%>

<html>
<head>
<title>Welcome to Job Search.com</title>

<script language="JavaScript" type="text/javascript">
//--------------- LOCALIZEABLE GLOBALS ---------------
var d=new Date();
var monthname=new Array("January","February","March","April","May","June","July","August","September","October","November","December");
//Ensure correct for language. English is "January 1, 2004"
var TODAY = monthname[d.getMonth()] + " " + d.getDate() + ", " + d.getFullYear();
//---------------   END LOCALIZEABLE   ---------------
</script>

</head>
<body>
	<hr width="100%" noshade="true">


	<table width="40%" border="0" cellspacing="0" cellpadding="0">

		<tr>
			<td height="33" colspan="3" id="tagline" valign="top" align="right">Flight
				Search Page</td>
			<td width="4">&nbsp;</td>
		</tr>


	</table>

	<html:errors />
	<html:form action="/search">
		<table width="700" height="118" border="0" cellpadding="0"
			cellspacing="10">
			<tr>
				<td width="300" class="pageName"><p>Enter Search Criteria:</p></td>
				<td>&nbsp;&nbsp</td>
			</tr>
			<tr>
				<td align="left">Origin<font
					color="red">*</font>:</td>
				<td width="85"><html:text property="key" /></td>
			</tr>
			<tr>
				<td align="left">Destination<font
					color="red">*</font>:</td>
				<td><html:text property="workExp" />(yrs)</td>
			</tr>
			<tr>
				<td align="left">Flight Duration:</td>
				<td><html:text property="expSalary" />(per annum)</td>
			</tr>
		
			<tr>
				<td align="left">Order Preference:</td>
				<td><html:text property="jobPreference" /></td>
			</tr>
			<tr>
				<td align="center"><html:submit value="search"/></td>
			</tr>
		</table>
	</html:form>
	<logic:present name="JobForm" property="results">

		<tr width="100%" size="1" noshade="true">

			<bean:size id="size" name="JobForm" property="results" />
			<logic:equal name="size" value="0">
				<center>
					<font color="red"><I>No Appropriate Job Found, please
							try again with more precise key words</I></font>
				</center>
			</logic:equal>

			<logic:greaterThan name="size" value="0">
				<table border="1">
					<tr>
						<th width="160"><font color="teal">Job Designation</font></th>
						<th><font color="teal">Salary</font></th>
						<th><font color="teal">Skill set</font></th>
						<th><font color="teal">JobPreference</font></th>
					</tr>
					<logic:iterate id="result" name="JobForm" property="results">
						<tr>
							<td height="100"><bean:write name="result" property="key" /></td>
							<td><bean:write name="result" property="expSalary" /></td>
							<td><bean:write name="result" property="skillSet" /></td>
							<td><bean:write name="result" property="jobPreference" /></td>
						</tr>
					</logic:iterate>
				</table>
			</logic:greaterThan>
	</logic:present>
	</table>
	<font color="red">* </font>
	<font color="teal">marked parameters are mendatory fields</font>
</body>
</html>

