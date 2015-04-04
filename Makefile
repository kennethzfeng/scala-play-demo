help:
	@echo "make test_heroku - Test Heroku Deployment Locally"

test_heroku:
	sbt compile stage
	foreman start
