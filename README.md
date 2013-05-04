![screenshot](https://raw.github.com/ics-software-engineering/play-example-fluentlenium/master/doc/images/play-example-bootstrap-screenshot.png)

An example play application illustrating the use of Twitter Bootstrap 2.x with Play 2.x.
GitHub Home Page is [here](http://ics-software-engineering.github.io/play-example-fluentlenium/). 


Key Points
----------

Installation:
  * Modify [project/Build.scala](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/project/Build.scala) to download webjars and bootstrap libraries into your project.
  
Make Twitter Bootstrap file available within your application:
  * Modify [conf/routes](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/conf/routes) with a routing for the webjars path.
  * Modify [app/views/main.scala.html](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/app/views/main.scala.html) header to load bootstrap.min.css via the webjar assets directory.

Tweak the body element so that it doesn't display underneath navbar:
  * Modify [public/stylesheets/main.css](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/public/stylesheets/main.css) to add 50px of padding to the body element (if you are using standard Bootstrap navbar). 

If using forms, provide a new Play "helper" definition so that forms display correctly:
  * Create [app/views/helper/twitterBootstrapInput.scala.html](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/app/views/helper/twitterBootstrapInput.scala.html) "helper" which provides [Bootstrap 2.0 style form element layout](http://twitter.github.io/bootstrap/base-css.html#forms).
  * In [pages with forms](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/app/views/index.scala.html), define your helper as the implicitFieldConstructor
   
Support highlighting the current page in the navbar
  * Modify the [main template](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/app/views/main.scala.html) to support the "active" page through parameters.
  
Usage
-----

Download the system, invoke `play run` from the top-level directory, then go to http://localhost:9000 to see the system. It should look like the screen dump at the top of this page.   