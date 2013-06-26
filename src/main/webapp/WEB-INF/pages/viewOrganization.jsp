<%@ include file="/common/taglibs.jsp" %>

<head>
    <title><fmt:message key="organizationManagement.title"/></title>
    <meta name="menu" content="OrganizationManagement"/>
</head>

<body class="organizationManagement"/>

<div class="span10">
    <ul>
        <li>
            <div class="detailLabel">
                <fmt:message key="organization.name"/>
            </div>
            <div class="detailValue">
                <s:property value="organization.name"/>
            </div>
        </li>
    </ul>
</div>