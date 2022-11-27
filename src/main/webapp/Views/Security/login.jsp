<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ include file="../../component/all_css.jsp"%>
<%@ include file="../../component/navbar.jsp"%>
<head>
<meta charset="ISO-8859-1">
<title>::Sing-In::</title>
</head>
<body>


	<section class="vh-100" style="background-color: #eee;">
		<div class="container h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-lg-12 col-xl-11">
					<div class="card text-black" style="border-radius: 25px;">
						<div class="card-body p-md-5">
							<div class="row justify-content-center">
								<div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

									<p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign
										in</p>

									<form action = "login", method = "post" >
										<!-- Email input -->
										<div class="form-outline mb-2">
											<input type="text" id="form2Example1" name = "username"
												class="form-control" /> <label class="form-label"
												for="form2Example1"><i
												class="fas fa-user fa-lg me-3 fa-fw"></i>User Code</label>
										</div>

										<!-- Password input -->
										<div class="form-outline mb-2">
											<input type="password" id="form2Example2" name = "password"
												class="form-control" /> <label class="form-label"
												for="form2Example2"><i
												class="fas fa-lock fa-lg me-3 fa-fw"></i>Password</label>
										</div>

										<!-- 2 column grid layout for inline styling -->
										<div class="row mb-2">
											<div class="col d-flex justify-content-center">
												<!-- Checkbox -->
												<div class="form-check">
													<input class="form-check-input" type="checkbox" value=""
														id="form2Example31" checked /> <label
														class="form-check-label" for="form2Example31">
														Remember me </label>
												</div>
											</div>

											<div class="col">
												<!-- Simple link -->
												<a href="#!">Forgot password?</a>
											</div>
										</div>

										<!-- Submit button -->
										<button type="submit" class="btn btn-primary btn-block mb-4">
											<i class="fas fa-sign-in-alt"></i>Sign in
										</button>


									</form>

								</div>
								<div
									class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">

									<img
										src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
										class="img-fluid" alt="Sample image">

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

</body>
</html>