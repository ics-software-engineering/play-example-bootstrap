![screenshot](https://raw.github.com/ics-software-engineering/play-example-bootstrap/master/doc/images/play-example-bootstrap-screenshot.png)

An example play application illustrating the use of Twitter Bootstrap 2.x with Play 2.x.
GitHub Home Page is [here](http://ics-software-engineering.github.io/play-example-bootstrap/). 


Key Points
----------

Download and install Bootstrap to your project:
  * Modify [project/Build.scala](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/project/Build.scala) to download webjars and bootstrap libraries into your project.
  
Make Twitter Bootstrap file available within your application:
  * Modify [conf/routes](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/conf/routes) with a routing for the webjars path.
  * Modify [app/views/main.scala.html](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/app/views/main.scala.html) header to load bootstrap.min.css via the webjar assets directory.

Tweak the body element so that it doesn't display underneath navbar:
  * Modify [public/stylesheets/main.css](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/public/stylesheets/main.css) to add 50px of padding to the body element (if you are using standard Bootstrap navbar). 

If using forms, provide a new Play "helper" definition so that forms display correctly:
  * Create [app/views/helper/twitterBootstrapInput.scala.html](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/app/views/helper/twitterBootstrapInput.scala.html) "helper" which provides [Bootstrap 2.0 style form element layout](http://twitter.github.io/bootstrap/base-css.html#forms).
  * In [pages with forms](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/app/views/index.scala.html), define your helper as the implicitFieldConstructor
   
Make the current page "active" in the navbar:
  * Modify the [main template](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/app/views/main.scala.html) to support the "active" page through a currentPage parameter.
  * Pass the currentPage parameter to the main template on [each page](https://github.com/ics-software-engineering/play-example-bootstrap/blob/master/app/views/index.scala.html) to tell it which navbar item to make active.
  * (Note: in this example, all three navbar items go to the same page.)
  
Usage
-----

Download the system, invoke `play run` from the top-level directory, then go to (http://localhost:9000) to see the system. It should look like the screen image at the top of this page. 

Screencast
----------

Click the image below to watch a 13 minute walkthrough of this example:

[<img src="https://raw.github.com/ics-software-engineering/play-example-bootstrap/master/doc/images/play-example-bootstrap-youtube.png" width="400">](https://www.youtube.com/watch?v=d__EdOxINEw)

Comments? Questions?
--------------------

Please create a [github issue](https://github.com/ics-software-engineering/play-example-bootstrap/issues).

Revision History
----------------

  * May 5, 2013: Initial release for Play 2.1.0. 
  