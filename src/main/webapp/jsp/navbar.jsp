<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <style>
        <%@ include file="../css/style.css" %>
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="/OnlineCatalog">Home</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Catalog</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/OnlineCatalog/ServletCourses">Courses</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/OnlineCatalog/ServletCourses">Students</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/OnlineCatalog/ServletProfessor">Professors</a>
                </li>
<%--                <li class="nav-item dropdown">--%>
<%--                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"--%>
<%--                       aria-expanded="false">--%>
<%--                        Dropdown--%>
<%--                    </a>--%>
<%--                    <ul class="dropdown-menu">--%>
<%--                        <li><a class="dropdown-item" href="#">Action</a></li>--%>
<%--                        <li><a class="dropdown-item" href="#">Another action</a></li>--%>
<%--                        <li>--%>
<%--                            <hr class="dropdown-divider">--%>
<%--                        </li>--%>
<%--                        <li><a class="dropdown-item" href="#">Something else here</a></li>--%>
<%--                    </ul>--%>
<%--                </li>--%>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
        crossorigin="anonymous"></script>
</body>
</html>
