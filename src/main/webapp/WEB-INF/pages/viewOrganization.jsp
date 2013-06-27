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
        <li>
            <div class="detailLabel">
                <fmt:message key="organization.address.address"/>
            </div>
            <div class="detailValue">
                <s:property value="organization.address.address"/>
            </div>
        </li>
        <li>
            <div class="detailLabel">
                <fmt:message key="organization.address.city"/>
            </div>
            <div class="detailValue">
                <s:property value="organization.address.city"/>
            </div>
        </li>
        <li>
            <div class="detailLabel">
                <fmt:message key="organization.address.province"/>
            </div>
            <div class="detailValue">
                <s:property value="organization.address.province"/>
            </div>
        </li>
        <li>
            <div class="detailLabel">
                <fmt:message key="organization.address.postalCode"/>
            </div>
            <div class="detailValue">
                <s:property value="organization.address.postalCode"/>
            </div>
        </li>
    </ul>
</div>