<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<c:set var="cp" value="${pageContext.request.contextPath}" />
  
<div class="container"> <!-- container start -->
<div class="row"><!-- row Start -->

<div class="col-lg-3">
<!-- empty column for space from right -->
</div>
<div class="col-lg-6"><!-- col Start -->
    <article role="login">
                <h3 class="text-center"><i class="fa fa-lock"></i>NEW USER</h3>

<form:form method="POST" action="${cp}/in" modelAttribute="user">
                
                 <div class="form-group">
                    <form:input path="id"/>
                  </div>
                
                  <div class="form-group">
                    <form:input path="name" class="form-control"
							placeholder="User Name" required="required" />
							<form:errors path="name" style="color:red;" />
                  </div>
                  
                        <div class="form-group">
                    <form:input path="password" type="password" class="form-control"
							placeholder="User Password" required="required" />
							<form:errors path="password" style="color:red;" />
                  </div>
                  
                       
                  <div class="form-group">
              <input type="submit"  value="REGISTER" class="btn btn-sm btn-primary">
                  </div>
                
                </form:form>

                <footer role="signup" class="text-center">
                  
                </footer>

              </article>
    </div> <!-- col over -->
    
    <div class="col-lg-3">
<!-- empty column for space from left -->
</div>
    
    </div> <!-- Row over -->
    
    </div><!-- Contain over -->