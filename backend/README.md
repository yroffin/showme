# Getting Started

## Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.10/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.10/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.10/reference/htmlsingle/index.html#web)
* [Liquibase Migration](https://docs.spring.io/spring-boot/docs/3.2.10/reference/htmlsingle/index.html#howto.data-initialization.migration-tool.liquibase)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.2.10/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)
* [Spring Shell](https://spring.io/projects/spring-shell)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.2.10/reference/htmlsingle/index.html#actuator)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.10/reference/htmlsingle/index.html#using.devtools)

## Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

## Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

# Development

This project was generated with [Spring initializr](https://start.spring.io/) version 3.3.4.

Swagger is [here](http://localhost:8080/swagger/swagger-ui/index.html)
H2 console is [here](http://localhost:8080/h2-console)

## Development server

Run `./mvnw spring-boot:run` for a dev server. Navigate to `http://localhost:8080/`. The application will automatically reload if you change any of the source files.

```shell
./mvnw spring-boot:run -Dspring-boot.run.arguments="scan --folder $PWD/.tmp --wildcard \.*.yaml"
```

## Build

Run `./mvnw package` to build the project.

## Running unit tests

Run `./mvnw test` to execute the unit tests.

# sample

```yaml
name: sample
meta:
  transition-duration: 1000
  width: 1024
  height: 768
  max-scale: 30
  min-scale: 0
  perspective: 1000
  autoplay: 1
slides:
- id: overview
  class: step
  data-x: 0
  data-y: 0
  data-z: 2000
  data-scale: 5
  data-rotate-z: 0
  contents:
  - renderer:
    content:
- id: slide-001
  class: step slide
  data-x: 0
  data-y: 0
  data-rotate-z: -45
  contents:
  - renderer: html
    content: >-
      <h1 class="slide-header">Simple deployment</h1>
      <div class="slide-body">
  - renderer: resource
    content: simple-deployment.svg
  - renderer: html
    content: >-
      </div>
      <h1 class="slide-footer">slide 1/3</h1>
- id: slide-002
  class: step slide
  data-x: 1500
  data-y: 0
  data-rotate-z: -35
  contents:
  - renderer: html
    content: >-
      <h1 class="slide-header">Some circle</h1>
      <div class="slide-body">
  - renderer: resource
    content: some-circle.svg
  - renderer: html
    content: >-
      </div>
      <h1 class="slide-footer">slide 2/3</h1>
- id: slide-003
  class: step slide
  data-x: 3000
  data-y: 500
  data-rotate-x: 90
  data-rotate-z: -25
  contents:
  - renderer: html
    content: >-
      <h1 class="slide-header">Some circle ...</h1>
      <div class="slide-body">
  - renderer: resource
    content: some-circle.svg
  - renderer: html
    content: >-
      </div>
      <h1 class="slide-footer">slide 3/3</h1>
head:
  title: Slide de test (head)
  description: Demo avec impress
  author: Yannick Roffin
  stylesheets:
  - href: https://fonts.googleapis.com/css?family=Open+Sans:regular,semibold,italic,italicsemibold|PT+Sans:400,700,400italic,700italic|PT+Serif:400,700,400italic,700italic
    rel: stylesheet
  - href: https://cdn.jsdelivr.net/gh/impress/impress.js@2.0.0/css/impress-common.css
    rel: stylesheet
  - href: favicon.png
    rel: shortcut icon
  - href: apple-touch-icon.png
    rel: apple-touch-icon
  - content: >-
      /*
          We start with a good ol' reset.
          That's the one by Eric Meyer http://meyerweb.com/eric/tools/css/reset/

          You can probably argue if it is needed here, or not, but for sure it
          doesn't do any harm and gives us a fresh start.
      */

      html, body, div, span, applet, object, iframe,
      h1, h2, h3, h4, h5, h6, p, blockquote, pre,
      a, abbr, acronym, address, big, cite, code,
      del, dfn, em, img, ins, kbd, q, s, samp,
      small, strike, strong, sub, sup, tt, var,
      b, u, i, center,
      dl, dt, dd, ol, ul, li,
      fieldset, form, label, legend,
      table, caption, tbody, tfoot, thead, tr, th, td,
      article, aside, canvas, details, embed,
      figure, figcaption, footer, header, hgroup,
      menu, nav, output, ruby, section, summary,
      time, mark, audio, video {
          margin: 0;
          padding: 0;
          border: 0;
          font-size: 100%;
          font: inherit;
          vertical-align: baseline;
      }

      /* HTML5 display-role reset for older browsers */
      article, aside, details, figcaption, figure,
      footer, header, hgroup, menu, nav, section {
          display: block;
      }
      body {
          line-height: 1;
      }
      ol, ul {
          list-style: none;
      }
      blockquote, q {
          quotes: none;
      }
      blockquote:before, blockquote:after,
      q:before, q:after {
          content: '';
          content: none;
      }

      table {
          border-collapse: collapse;
          border-spacing: 0;
      }

      /*
          Now here is when interesting things start to appear.

          We set up <body> styles with default font and nice gradient in the background.
          And yes, there is a lot of repetition there because of -prefixes but we don't
          want to leave anybody behind.
      */
      body {
          font-family: 'PT Sans', sans-serif;
          min-height: 740px;

          background: rgb(215, 215, 215);
          background: -webkit-gradient(radial, 50% 50%, 0, 50% 50%, 500, from(rgb(240, 240, 240)), to(rgb(190, 190, 190)));
          background: -webkit-radial-gradient(rgb(240, 240, 240), rgb(190, 190, 190));
          background:    -moz-radial-gradient(rgb(240, 240, 240), rgb(190, 190, 190));
          background:     -ms-radial-gradient(rgb(240, 240, 240), rgb(190, 190, 190));
          background:      -o-radial-gradient(rgb(240, 240, 240), rgb(190, 190, 190));
          background:         radial-gradient(rgb(240, 240, 240), rgb(190, 190, 190));
      }

      /*
          Now let's bring some text styles back ...
      */
      b, strong { font-weight: bold }
      i, em { font-style: italic }

      /*
          ... and give links a nice look.
      */
      a {
          color: inherit;
          text-decoration: none;
          padding: 0 0.1em;
          background: rgba(255,255,255,0.5);
          text-shadow: -1px -1px 2px rgba(100,100,100,0.9);
          border-radius: 0.2em;

          -webkit-transition: 0.5s;
          -moz-transition:    0.5s;
          -ms-transition:     0.5s;
          -o-transition:      0.5s;
          transition:         0.5s;
      }

      a:hover,
      a:focus {
          background: rgba(255,255,255,1);
          text-shadow: -1px -1px 2px rgba(100,100,100,0.5);
      }
  - href: https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css
    rel: stylesheet
  - href: https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap-theme.min.css
    rel: stylesheet
    # some comment
  - content: >-
      /*
          Now let's style the presentation steps.

          We start with basics to make sure it displays correctly in everywhere ...
      */

      .step {
          position: relative;
          width: 900px;
          padding: 40px;
          margin: 20px auto;

          -webkit-box-sizing: border-box;
          -moz-box-sizing:    border-box;
          -ms-box-sizing:     border-box;
          -o-box-sizing:      border-box;
          box-sizing:         border-box;

          font-family: 'PT Serif', georgia, serif;
          font-size: 18px;
          line-height: 1.5;
      }

      /*
          ... and we enhance the styles for impress.js.

          Basically we remove the margin and make inactive steps a little bit transparent.
      */
      .impress-enabled .step {
          margin: 0;
          opacity: 0.3;

          -webkit-transition: opacity 1s;
          -moz-transition:    opacity 1s;
          -ms-transition:     opacity 1s;
          -o-transition:      opacity 1s;
          transition:         opacity 1s;
      }

      .impress-enabled .step.active { opacity: 1 }

      /*
       * default style for slide
       */
      .slide {
          display: block;

          width: 900px;
          height: 700px;
          padding: 40px 60px;

          background-color: white;
          border: 1px solid rgba(0, 0, 0, .3);
          border-radius: 10px;
          box-shadow: 0 2px 6px rgba(0, 0, 0, .1);

          color: rgb(102, 102, 102);
          text-shadow: 0 2px 2px rgba(0, 0, 0, .1);

          font-family: 'Open Sans', Arial, sans-serif;
          font-size: 18px;
          line-height: 18px;
          letter-spacing: -1px;
      }

      /*
       * body
       */
      .slide-header {
          font-size: 64px;
          padding: 0;

          -webkit-transform: translateZ(50px);
          -moz-transform:    translateZ(50px);
          -ms-transform:     translateZ(50px);
          -o-transform:      translateZ(50px);
          transform:         translateZ(50px);
      }

      .slide-body {
          display: flex;
          height: 450px;
          justify-content: center;
          align-items: center;
      }

      .slide-footer {
          font-size: 32px;
      }

      /*
          The last step is an overview.
          There is no content in it, so we make sure it's not visible because we want
          to be able to click on other steps.

      */
      #overview { display: none }

      /*
          We also make other steps visible and give them a pointer cursor using the
          `impress-on-` class.
      */
      .impress-on-overview .step {
          opacity: 1;
          cursor: pointer;
      }

      /*
          Now, when we have all the steps styled let's give users a hint how to navigate
          around the presentation.

          The best way to do this would be to use JavaScript, show a delayed hint for a
          first time users, then hide it and store a status in cookie or localStorage...

          But I wanted to have some CSS fun and avoid additional scripting...

          Let me explain it first, so maybe the transition magic will be more readable
          when you read the code.

          First of all I wanted the hint to appear only when user is idle for a while.
          You can't detect the 'idle' state in CSS, but I delayed a appearing of the
          hint by 5s using transition-delay.

          You also can't detect in CSS if the user is a first-time visitor, so I had to
          make an assumption that I'll only show the hint on the first step. And when
          the step is changed hide the hint, because I can assume that user already
          knows how to navigate.

          To summarize it - hint is shown when the user is on the first step for longer
          than 5 seconds.

          The other problem I had was caused by the fact that I wanted the hint to fade
          in and out. It can be easily achieved by transitioning the opacity property.
          But that also meant that the hint was always on the screen, even if totally
          transparent. It covered part of the screen and you couldn't correctly clicked
          through it.
          Unfortunately you cannot transition between display `block` and `none` in pure
          CSS, so I needed a way to not only fade out the hint but also move it out of
          the screen.

          I solved this problem by positioning the hint below the bottom of the screen
          with CSS transform and moving it up to show it. But I also didn't want this move
          to be visible. I wanted the hint only to fade in and out visually, so I delayed
          the fade in transition, so it starts when the hint is already in its correct
          position on the screen.

          I know, it sounds complicated ... maybe it would be easier with the code?
      */

      .hint {
          /*
              We hide the hint until presentation is started and from browsers not supporting
              impress.js, as they will have a linear scrollable view ...
          */
          display: none;

          /*
              ... and give it some fixed position and nice styles.
          */
          position: fixed;
          left: 0;
          right: 0;
          bottom: 200px;

          background: rgba(0,0,0,0.5);
          color: #EEE;
          text-align: center;

          font-size: 50px;
          padding: 20px;

          z-index: 100;

          /*
              By default we don't want the hint to be visible, so we make it transparent ...
          */
          opacity: 0;

          /*
              ... and position it below the bottom of the screen (relative to it's fixed position)
          */
          -webkit-transform: translateY(400px);
          -moz-transform:    translateY(400px);
          -ms-transform:     translateY(400px);
          -o-transform:      translateY(400px);
          transform:         translateY(400px);

          /*
              Now let's imagine that the hint is visible and we want to fade it out and move out
              of the screen.

              So we define the transition on the opacity property with 1s duration and another
              transition on transform property delayed by 1s so it will happen after the fade out
              on opacity finished.

              This way user will not see the hint moving down.
          */
          -webkit-transition: opacity 1s, -webkit-transform 0.5s 1s;
          -moz-transition:    opacity 1s,    -moz-transform 0.5s 1s;
          -ms-transition:     opacity 1s,     -ms-transform 0.5s 1s;
          -o-transition:      opacity 1s,      -o-transform 0.5s 1s;
          transition:         opacity 1s,         transform 0.5s 1s;
      }

      /*
          ... and we will show it when the first step (with id 'bored') is active.
      */
      .impress-on-bored .hint {
          /*
              We remove the transparency and position the hint in its default fixed
              position.
          */
          opacity: 1;

          -webkit-transform: translateY(0px);
          -moz-transform:    translateY(0px);
          -ms-transform:     translateY(0px);
          -o-transform:      translateY(0px);
          transform:         translateY(0px);

          /*
              Now for fade in transition we have the oposite situation from the one
              above.

              First after 4.5s delay we animate the transform property to move the hint
              into its correct position and after that we fade it in with opacity
              transition.
          */
          -webkit-transition: opacity 1s 5s, -webkit-transform 0.5s 4.5s;
          -moz-transition:    opacity 1s 5s,    -moz-transform 0.5s 4.5s;
          -ms-transition:     opacity 1s 5s,     -ms-transform 0.5s 4.5s;
          -o-transition:      opacity 1s 5s,      -o-transform 0.5s 4.5s;
          transition:         opacity 1s 5s,         transform 0.5s 4.5s;
      }
resources:
- name: some-circle.svg
  content: >-
    <svg version="1.1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 340.7904276136401 336.9188190045097" width="340.7904276136401" height="336.9188190045097">
      <!-- svg-source:excalidraw -->

      <defs>
        <style class="style-fonts">

        </style>

      </defs>
      <g stroke-linecap="round" transform="translate(10 39.31360804055669) rotate(0 89.04699800999322 86.83465023334736)"><path d="M17.98 34.18 C17.98 34.18, 17.98 34.18, 17.98 34.18 M17.98 34.18 C17.98 34.18, 17.98 34.18, 17.98 34.18 M11.82 47.37 C18.26 38.45, 27.99 27.33, 36.09 19.45 M11.82 47.37 C19.88 38.89, 27.99 28.82, 36.09 19.45 M4.99 61.32 C22.4 44.5, 36.04 24.57, 48.95 10.75 M4.99 61.32 C16.34 49.33, 25.3 37.45, 48.95 10.75 M2.11 70.73 C19.39 49.34, 40.4 28.77, 55.9 8.85 M2.11 70.73 C15.11 56.79, 26.73 41.04, 55.9 8.85 M1.85 77.13 C25.33 51.69, 49.22 23.78, 63.52 6.19 M1.85 77.13 C26.31 48.83, 48.71 21.86, 63.52 6.19 M2.24 82.77 C24.64 58.11, 41.94 37.98, 70.47 4.28 M2.24 82.77 C29.27 52.31, 56.55 21.13, 70.47 4.28 M1.98 89.17 C17.89 67.09, 36.43 45.43, 78.08 1.63 M1.98 89.17 C25.79 62.53, 49.33 37.3, 78.08 1.63 M1.72 95.57 C16.69 74.93, 34.51 55.81, 83.73 1.23 M1.72 95.57 C24.1 70.26, 46.68 45.67, 83.73 1.23 M2.11 101.21 C26.27 70.06, 52.28 43.25, 88.71 1.59 M2.11 101.21 C34.39 63.02, 67.07 26.93, 88.71 1.59 M3.16 106.1 C35.38 68.61, 73.36 26.22, 93.7 1.95 M3.16 106.1 C35.23 68.29, 65.91 30.62, 93.7 1.95 M4.87 110.23 C32.95 82.91, 57.67 50.67, 98.03 3.07 M4.87 110.23 C39.78 68.25, 75.76 27.94, 98.03 3.07 M6.58 114.37 C28.72 90.29, 50.19 62.89, 103.02 3.43 M6.58 114.37 C29.78 89.11, 50.98 65.17, 103.02 3.43 M8.28 118.5 C37.48 85.37, 67.75 52.53, 108 3.79 M8.28 118.5 C30.5 91.91, 54.91 62.95, 108 3.79 M9.99 122.64 C34.17 96.96, 56.8 68.18, 112.99 4.15 M9.99 122.64 C42.27 85.18, 75.63 49.12, 112.99 4.15 M11.7 126.77 C41.32 95.54, 69.65 61.09, 117.98 4.51 M11.7 126.77 C36.59 97.02, 61.59 68.58, 117.98 4.51 M13.4 130.9 C56.92 82.84, 98 35.1, 121.65 6.38 M13.4 130.9 C47.06 91.45, 80.91 54.1, 121.65 6.38 M15.11 135.04 C49.92 98.79, 82.63 60.92, 124.67 9 M15.11 135.04 C38.57 106.02, 63.35 77.35, 124.67 9 M17.47 138.42 C57.72 94.86, 96.23 48.77, 128.35 10.87 M17.47 138.42 C54.58 95.62, 94.11 51.45, 128.35 10.87 M20.49 141.04 C51.64 104.72, 82.34 66.5, 132.02 12.74 M20.49 141.04 C64.94 89.95, 109.36 38.92, 132.02 12.74 M23.51 143.66 C57.47 104.03, 92.87 63.57, 135.7 14.61 M23.51 143.66 C51.14 109.88, 79.79 79.04, 135.7 14.61 M26.53 146.29 C61.6 106.98, 93.22 71.24, 138.72 17.23 M26.53 146.29 C60.61 104.86, 94.51 65.43, 138.72 17.23 M29.55 148.91 C64.87 112, 96.17 71.16, 142.39 19.1 M29.55 148.91 C61.26 111.51, 92.58 76.27, 142.39 19.1 M32.57 151.54 C58.15 122.96, 82.22 92.5, 146.07 20.97 M32.57 151.54 C65.95 111.17, 101.16 72.62, 146.07 20.97 M34.93 154.92 C61.95 120.67, 93.5 87.45, 149.08 23.6 M34.93 154.92 C75.52 108.21, 116.6 61.19, 149.08 23.6 M37.95 157.54 C74.28 115.85, 107.97 77.89, 151.45 26.98 M37.95 157.54 C65.87 126.55, 92.92 96.29, 151.45 26.98 M40.97 160.16 C66.21 129.05, 90.9 100.94, 154.47 29.6 M40.97 160.16 C72.27 124.11, 105.12 87.59, 154.47 29.6 M44.64 162.03 C71.52 130.83, 99.14 97.81, 156.83 32.98 M44.64 162.03 C86.02 114.67, 126.31 67.89, 156.83 32.98 M48.97 163.15 C84.8 117.95, 124.5 75.86, 159.19 36.36 M48.97 163.15 C80.93 126.25, 112.51 90.12, 159.19 36.36 M52.65 165.02 C77.49 136.58, 103.31 103.31, 161.55 39.74 M52.65 165.02 C84.41 128.38, 116.71 92.46, 161.55 39.74 M56.98 166.13 C83.58 139.62, 107.59 109.8, 163.92 43.12 M56.98 166.13 C86.61 133.46, 115.93 97.81, 163.92 43.12 M61.31 167.25 C99.63 124.2, 137.62 81.75, 166.28 46.49 M61.31 167.25 C99.15 123.78, 138.14 78.93, 166.28 46.49 M64.99 169.12 C103.85 127.13, 143.61 83.94, 168.64 49.87 M64.99 169.12 C86.76 141.89, 110.38 114.57, 168.64 49.87 M69.32 170.23 C91.91 145.41, 113.67 119.5, 171.66 52.5 M69.32 170.23 C101.58 135.04, 131.03 99.54, 171.66 52.5 M72.99 172.1 C111.46 128.1, 148.34 88.94, 172.71 57.39 M72.99 172.1 C105.77 132.75, 139.08 94.13, 172.71 57.39 M77.32 173.22 C98.15 147.11, 120.16 122.68, 173.76 62.27 M77.32 173.22 C114.65 131.63, 153.09 87.7, 173.76 62.27 M82.31 173.58 C113.1 136.45, 144.81 103.53, 174.81 67.16 M82.31 173.58 C112.41 138.85, 140.62 105.22, 174.81 67.16 M88.61 172.43 C105.68 153.46, 120.97 132.34, 175.86 72.05 M88.61 172.43 C110.74 146.85, 134.29 121.12, 175.86 72.05 M94.25 172.03 C111.9 150.6, 129.22 131.55, 176.91 76.94 M94.25 172.03 C118.48 144.4, 142.12 115.23, 176.91 76.94 M99.89 171.64 C124.15 139.39, 153.08 108, 177.97 81.83 M99.89 171.64 C123.83 144.61, 146.19 117.22, 177.97 81.83 M105.54 171.24 C128.83 145.73, 148.37 121.46, 178.36 87.47 M105.54 171.24 C126.4 148.31, 146.17 125.49, 178.36 87.47 M111.84 170.09 C128.67 150.67, 141.78 132.84, 176.13 96.13 M111.84 170.09 C131.21 147.11, 149.61 126.85, 176.13 96.13 M119.45 167.44 C137.66 143.54, 157.24 123.85, 173.9 104.79 M119.45 167.44 C136.62 148.22, 152.5 126.94, 173.9 104.79 M129.68 161.76 C143.14 147.97, 153.08 135.73, 172.33 112.7 M129.68 161.76 C144.41 145.08, 158.79 129.75, 172.33 112.7 M139.26 156.83 C145.26 148.28, 151.37 141.14, 170.1 121.36 M139.26 156.83 C150.22 145.99, 159.85 133.36, 170.1 121.36" stroke="#b2f2bb" stroke-width="0.5" fill="none"></path><path d="M117.61 4.22 C128.62 6.48, 139.7 14.52, 148.57 22.51 C157.43 30.5, 165.86 41.32, 170.8 52.16 C175.75 63, 178.49 75.56, 178.25 87.57 C178.01 99.57, 174.48 113.38, 169.34 124.2 C164.2 135.02, 156.53 144.91, 147.42 152.48 C138.31 160.05, 126.3 166.14, 114.68 169.62 C103.06 173.1, 89.7 174.76, 77.69 173.36 C65.67 171.96, 52.84 167.2, 42.6 161.23 C32.36 155.25, 23.14 147.1, 16.26 137.52 C9.38 127.93, 3.76 115.2, 1.33 103.72 C-1.1 92.24, -1.12 80.22, 1.67 68.61 C4.46 57.01, 10.6 43.71, 18.07 34.08 C25.54 24.45, 36.06 16.47, 46.49 10.84 C56.92 5.21, 68.25 1.1, 80.67 0.28 C93.09 -0.53, 113.85 4.46, 121.02 5.94 C128.2 7.42, 124.15 7.97, 123.72 9.16 M123.06 7.01 C134.46 10.19, 146.7 18.98, 155.33 27.79 C163.96 36.61, 170.93 48.62, 174.85 59.91 C178.77 71.21, 180.26 84.09, 178.85 95.58 C177.43 107.08, 172.4 118.63, 166.37 128.89 C160.34 139.15, 152.38 150.26, 142.65 157.15 C132.91 164.04, 120.05 167.64, 107.97 170.22 C95.89 172.8, 81.69 174.79, 70.18 172.63 C58.66 170.46, 48.31 163.91, 38.87 157.23 C29.43 150.55, 19.72 142.82, 13.53 132.56 C7.34 122.3, 3.21 107.49, 1.71 95.67 C0.2 83.84, 0.88 72.6, 4.5 61.6 C8.12 50.6, 15.38 38.83, 23.42 29.67 C31.45 20.51, 42.09 11.58, 52.71 6.65 C63.32 1.72, 75.23 0.21, 87.11 0.12 C98.98 0.02, 118.04 4.82, 123.96 6.09 C129.87 7.37, 123.17 6.53, 122.61 7.78" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g stroke-linecap="round" transform="translate(102.36551967496189 10) rotate(0 53.096346639499075 51.99017275117615)"><path d="M22.34 10.14 C22.34 10.14, 22.34 10.14, 22.34 10.14 M22.34 10.14 C22.34 10.14, 22.34 10.14, 22.34 10.14 M7.64 33.15 C11.16 25.91, 17.04 18.8, 30.61 6.73 M7.64 33.15 C14.9 24.49, 22.47 17.62, 30.61 6.73 M6.73 40.3 C11.92 31.78, 19.54 24.39, 39.53 2.56 M6.73 40.3 C15.77 30.05, 25.11 20.69, 39.53 2.56 M5.81 47.45 C16.49 31.55, 29.14 20.12, 47.14 -0.1 M5.81 47.45 C21.03 28.78, 36.73 12.21, 47.14 -0.1 M1.61 58.38 C18.67 38.52, 41.09 14.03, 51.47 1.02 M1.61 58.38 C19.59 37.58, 35.84 16.51, 51.47 1.02 M3.32 62.51 C19.84 47.64, 33.43 28.19, 55.8 2.13 M3.32 62.51 C22.84 38.58, 43.35 16.07, 55.8 2.13 M5.02 66.64 C17.35 53.16, 29.39 36.59, 60.13 3.25 M5.02 66.64 C18.42 52.06, 30.26 38.88, 60.13 3.25 M6.73 70.78 C23.42 51.72, 41.56 32.84, 65.12 3.61 M6.73 70.78 C19.43 55.51, 33.87 38.01, 65.12 3.61 M8.44 74.91 C22.85 60.38, 35.59 42.98, 69.45 4.72 M8.44 74.91 C27.24 52.53, 47.45 31.59, 69.45 4.72 M10.14 79.04 C28.28 60.67, 45.17 39.37, 73.78 5.84 M10.14 79.04 C25.2 61.1, 39.9 44.51, 73.78 5.84 M11.85 83.18 C38.96 54.13, 63.54 25.39, 77.46 7.71 M11.85 83.18 C32.1 58.96, 53 36.51, 77.46 7.71 M14.87 85.8 C36.15 64.46, 55.7 41.73, 80.48 10.33 M14.87 85.8 C28.88 68.56, 43.77 51.26, 80.48 10.33 M17.89 88.43 C42.7 62.97, 65.35 35.13, 84.15 12.2 M17.89 88.43 C39.9 63.21, 63.98 36.82, 84.15 12.2 M20.91 91.05 C39.43 69.74, 57.42 46.12, 87.17 14.83 M20.91 91.05 C47.18 60.83, 73.74 30.35, 87.17 14.83 M23.93 93.67 C43.61 70.37, 65.01 46.01, 90.19 17.45 M23.93 93.67 C39.89 73.41, 57.11 55.72, 90.19 17.45 M26.95 96.3 C48.58 72.62, 66.82 52.27, 93.86 19.32 M26.95 96.3 C47.4 71.2, 67.18 48.02, 93.86 19.32 M29.96 98.92 C51.51 77.63, 69.55 52.04, 96.88 21.94 M29.96 98.92 C48.83 76.6, 67.39 56.04, 96.88 21.94 M32.98 101.55 C48.39 85.2, 61.97 66.8, 98.59 26.08 M32.98 101.55 C52.06 77.9, 72.92 55.86, 98.59 26.08 M37.97 101.91 C51.95 83.04, 70.44 64.85, 100.3 30.21 M37.97 101.91 C60.33 76.39, 82.76 50.84, 100.3 30.21 M42.96 102.27 C62.5 79.89, 79 61.7, 102 34.34 M42.96 102.27 C57.32 85.89, 71.4 70.55, 102 34.34 M47.29 103.38 C59.96 87.32, 71.65 74.17, 104.37 37.72 M47.29 103.38 C62.89 85.62, 79.92 67.32, 104.37 37.72 M52.28 103.74 C64.62 89.15, 78.14 72.35, 106.07 41.86 M52.28 103.74 C72.27 80.9, 91.08 58.83, 106.07 41.86 M57.26 104.1 C72.38 82.72, 90.97 64.9, 107.12 46.74 M57.26 104.1 C71.51 86.91, 85.89 70.57, 107.12 46.74 M61.59 105.22 C71.16 94.44, 81.37 79.12, 106.21 53.9 M61.59 105.22 C74.42 90.06, 88.16 75.49, 106.21 53.9 M69.86 101.8 C79.35 93.85, 87.02 82.83, 104.63 61.8 M69.86 101.8 C79.26 91.65, 88.55 79.04, 104.63 61.8 M78.13 98.39 C88.41 87.34, 98.12 77.43, 103.71 68.96 M78.13 98.39 C86.65 88.32, 97.1 76.3, 103.71 68.96" stroke="#ffec99" stroke-width="0.5" fill="none"></path><path d="M46.22 -0.63 C54.32 -2.24, 65.51 1.69, 73.65 5.17 C81.78 8.65, 89.59 13.44, 95.03 20.23 C100.47 27.01, 105.1 37.14, 106.3 45.87 C107.5 54.6, 105.73 64.8, 102.22 72.62 C98.71 80.45, 92.38 87.71, 85.26 92.82 C78.13 97.94, 68.43 102.16, 59.49 103.33 C50.54 104.51, 39.64 103.33, 31.58 99.86 C23.51 96.39, 16.23 89.44, 11.1 82.5 C5.97 75.56, 1.78 66.89, 0.79 58.23 C-0.19 49.57, 1.64 38.5, 5.19 30.53 C8.74 22.56, 13.82 15.34, 22.1 10.42 C30.38 5.5, 48.06 2.43, 54.89 1.01 C61.71 -0.41, 63.16 1.3, 63.06 1.9 M50.71 -1.37 C59.27 -2.53, 69.97 2.6, 78.02 6.63 C86.07 10.67, 94.51 15.68, 99.04 22.85 C103.57 30.03, 104.91 40.68, 105.2 49.7 C105.49 58.72, 104.87 69.26, 100.79 76.98 C96.71 84.69, 88.29 91.36, 80.71 95.99 C73.14 100.61, 63.89 104.46, 55.33 104.72 C46.77 104.98, 37.37 101.48, 29.33 97.54 C21.28 93.6, 11.81 88.49, 7.06 81.08 C2.31 73.66, 0.89 61.85, 0.83 53.06 C0.76 44.27, 2.48 35.97, 6.67 28.34 C10.86 20.71, 18.4 11.8, 25.96 7.28 C33.52 2.75, 47.7 1.99, 52.05 1.18 C56.39 0.36, 52.21 1.93, 52.02 2.39" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g stroke-linecap="round" transform="translate(122.82973660893549 135.5507363246487) rotate(0 53.096346639499075 51.99017275117615)"><path d="M8.96 23.69 C8.96 23.69, 8.96 23.69, 8.96 23.69 M8.96 23.69 C8.96 23.69, 8.96 23.69, 8.96 23.69 M6.08 33.11 C14.32 27.2, 20.8 18.31, 29.04 6.69 M6.08 33.11 C11.68 27.89, 15.16 22.45, 29.04 6.69 M3.19 42.52 C15.33 30.97, 26.2 17.36, 35.34 5.54 M3.19 42.52 C10.88 33.61, 16.98 26.44, 35.34 5.54 M0.96 51.19 C14.25 36.02, 24.2 25.36, 42.29 3.64 M0.96 51.19 C11.56 38.21, 23.44 25.1, 42.29 3.64 M2.01 56.07 C15.21 39.89, 30.45 20.52, 48.59 2.49 M2.01 56.07 C19.97 35.24, 38.21 14.32, 48.59 2.49 M3.06 60.96 C20.97 40.88, 36.89 19.72, 54.89 1.34 M3.06 60.96 C21.84 39.28, 40.96 18.99, 54.89 1.34 M3.46 66.6 C26.97 40.86, 48.13 16.33, 59.88 1.7 M3.46 66.6 C16.38 51.06, 30.16 34.31, 59.88 1.7 M4.51 71.49 C23.22 45.49, 43.61 22.98, 64.21 2.81 M4.51 71.49 C23.97 49.14, 42.67 26.9, 64.21 2.81 M4.9 77.14 C17.74 60.5, 33.43 44.58, 68.54 3.93 M4.9 77.14 C19.84 60.29, 34.03 44.3, 68.54 3.93 M7.92 79.76 C27.24 59.26, 48.31 36.71, 72.87 5.04 M7.92 79.76 C23.7 60.8, 41.43 41.68, 72.87 5.04 M10.94 82.38 C23.65 66.78, 38.76 50.7, 77.2 6.16 M10.94 82.38 C30.52 59.78, 49.84 38.8, 77.2 6.16 M13.96 85.01 C27.18 67.68, 45.1 51.71, 81.53 7.27 M13.96 85.01 C41.58 53.6, 67.25 23.83, 81.53 7.27 M16.98 87.63 C32.19 72.95, 45.28 57.55, 84.55 9.9 M16.98 87.63 C33.73 68.91, 51.06 47.83, 84.55 9.9 M19.34 91.01 C32.64 75.01, 46.5 57.83, 86.91 13.28 M19.34 91.01 C45.31 59.48, 71.82 28.04, 86.91 13.28 M22.36 93.64 C44.08 69.6, 62.93 46.51, 89.93 15.9 M22.36 93.64 C37.42 74.51, 55.06 56.87, 89.93 15.9 M25.38 96.26 C40.88 78.93, 53.6 62.79, 92.95 18.53 M25.38 96.26 C45.45 73.27, 65.14 48.44, 92.95 18.53 M29.71 97.38 C43.89 79.46, 61.56 59.54, 95.31 21.9 M29.71 97.38 C47.01 77.02, 64.42 58.37, 95.31 21.9 M33.38 99.25 C52.33 79.6, 67.22 59.86, 98.33 24.53 M33.38 99.25 C55.88 73.38, 78.85 46.72, 98.33 24.53 M37.71 100.36 C53.31 79.31, 68.37 62.68, 100.7 27.91 M37.71 100.36 C52.06 84.79, 66.13 67.42, 100.7 27.91 M42.04 101.47 C66.34 75.89, 89.02 46.5, 102.4 32.04 M42.04 101.47 C64.02 78.38, 84.61 54.24, 102.4 32.04 M46.38 102.59 C70.9 78.04, 90.67 49.67, 102.8 37.68 M46.38 102.59 C64.11 83.64, 79.39 63.78, 102.8 37.68 M50.05 104.46 C69.37 82.26, 85.14 61.5, 103.85 42.57 M50.05 104.46 C67.6 85.25, 84.48 64.71, 103.85 42.57 M56.35 103.31 C66.17 91.57, 78.92 76.33, 104.9 47.46 M56.35 103.31 C74.45 82.2, 93.23 60.74, 104.9 47.46 M63.31 101.41 C77.55 85.68, 89.24 70.1, 105.29 53.1 M63.31 101.41 C73.01 89.97, 85.04 77.15, 105.29 53.1 M70.26 99.5 C82.36 86.32, 93.14 73.68, 104.38 60.26 M70.26 99.5 C79.41 89.13, 87.73 78.12, 104.38 60.26 M77.22 97.6 C87.34 86.71, 95.03 77.01, 101.49 69.67 M77.22 97.6 C85.64 86.73, 93.35 78.35, 101.49 69.67" stroke="#ffec99" stroke-width="0.5" fill="none"></path><path d="M56.09 0.4 C64.37 -0.15, 74.29 2.73, 81.79 7.28 C89.28 11.84, 97.12 19.78, 101.05 27.73 C104.98 35.68, 105.95 46.27, 105.36 54.99 C104.76 63.71, 102.26 72.93, 97.49 80.04 C92.72 87.15, 84.46 93.58, 76.74 97.64 C69.02 101.69, 59.81 104.62, 51.17 104.37 C42.54 104.12, 32.61 100.74, 24.94 96.14 C17.28 91.53, 9.18 84.51, 5.18 76.74 C1.18 68.96, 0.36 58.28, 0.95 49.49 C1.54 40.7, 4.09 31.17, 8.71 23.98 C13.34 16.79, 19.34 10.23, 28.71 6.36 C38.07 2.5, 57.54 0.98, 64.89 0.79 C72.24 0.59, 73.07 4.23, 72.83 5.19 M64.69 2.73 C73.05 4.23, 84.08 9.76, 90.57 15.51 C97.07 21.27, 101.08 29.18, 103.66 37.25 C106.25 45.33, 107.98 55.65, 106.07 63.98 C104.17 72.3, 98.71 80.69, 92.23 87.22 C85.74 93.76, 75.88 100.46, 67.17 103.2 C58.45 105.95, 48.44 105.85, 39.94 103.71 C31.44 101.56, 22.43 96.49, 16.17 90.34 C9.9 84.19, 4.81 75.33, 2.36 66.81 C-0.08 58.29, -0.64 47.75, 1.5 39.22 C3.63 30.69, 9.11 21.78, 15.2 15.64 C21.29 9.51, 29.79 4.91, 38.03 2.41 C46.27 -0.09, 60.26 0.42, 64.65 0.63 C69.05 0.83, 64.7 2.86, 64.38 3.64" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g stroke-linecap="round" transform="translate(171.50138769514297 179.7976918575646) rotate(0 53.096346639499075 51.99017275117615)"><path d="M18.71 12.29 C18.71 12.29, 18.71 12.29, 18.71 12.29 M18.71 12.29 C18.71 12.29, 18.71 12.29, 18.71 12.29 M4.01 35.29 C10.28 24.58, 19.54 18.2, 27.63 8.12 M4.01 35.29 C12.74 26.23, 20.14 15.64, 27.63 8.12 M3.09 42.44 C12.62 32.59, 23.5 21.02, 36.55 3.95 M3.09 42.44 C14.31 28.13, 27.75 14.39, 36.55 3.95 M2.83 48.84 C11.34 36.42, 23.19 24.29, 43.51 2.05 M2.83 48.84 C15.68 34.07, 26.89 19.7, 43.51 2.05 M1.92 55.99 C12.28 46.12, 20.58 33.62, 48.5 2.41 M1.92 55.99 C16.96 36.95, 32.6 20.23, 48.5 2.41 M1 63.14 C18.66 42.13, 38.34 18.25, 53.48 2.77 M1 63.14 C19.31 41.57, 38.35 19.58, 53.48 2.77 M2.7 67.28 C16.43 52.06, 27.35 40.53, 59.13 2.37 M2.7 67.28 C13.51 54.05, 24.78 41.01, 59.13 2.37 M5.07 70.66 C23.51 50.01, 43.92 25.44, 64.11 2.73 M5.07 70.66 C19.63 54.41, 33.51 38.64, 64.11 2.73 M7.43 74.03 C25.45 55.21, 37.69 35.79, 69.76 2.34 M7.43 74.03 C27.47 53.1, 46.15 31.9, 69.76 2.34 M9.14 78.17 C23.81 61.89, 39.76 43.98, 73.43 4.21 M9.14 78.17 C25.48 59.94, 43.24 40.34, 73.43 4.21 M11.5 81.55 C34.78 57.49, 57.94 28.68, 76.45 6.83 M11.5 81.55 C25.71 65.54, 41.02 47.08, 76.45 6.83 M13.21 85.68 C30.64 64.03, 50.46 38.85, 80.12 8.7 M13.21 85.68 C31.77 65.57, 49.77 44.8, 80.12 8.7 M16.23 88.31 C30.35 70.16, 46.81 54.92, 83.14 11.32 M16.23 88.31 C30.42 69.32, 47.29 51.05, 83.14 11.32 M19.9 90.17 C43.91 64.71, 65.75 36.53, 86.82 13.19 M19.9 90.17 C37.95 67.83, 57.84 47.89, 86.82 13.19 M22.92 92.8 C40.7 74.7, 56.28 55.1, 90.49 15.06 M22.92 92.8 C40.75 73.74, 56.96 53.84, 90.49 15.06 M26.59 94.67 C41.59 79.66, 54.62 61.9, 93.51 17.69 M26.59 94.67 C43.77 74.65, 59.69 53.99, 93.51 17.69 M29.61 97.29 C53.03 70.28, 77.42 44.12, 95.22 21.82 M29.61 97.29 C44.54 79.49, 61.06 61.94, 95.22 21.82 M33.29 99.16 C54.61 77, 75.08 50.47, 97.58 25.2 M33.29 99.16 C56.32 73.68, 76.94 49.76, 97.58 25.2 M36.96 101.03 C57.07 79.84, 75.21 58.27, 99.29 29.33 M36.96 101.03 C51.74 82.47, 68.42 64.76, 99.29 29.33 M41.95 101.39 C57.66 81.44, 73.96 61.21, 101 33.47 M41.95 101.39 C54.49 87.28, 66.46 73.35, 101 33.47 M46.94 101.75 C69.64 75.08, 90.72 52.92, 103.36 36.85 M46.94 101.75 C68.38 78.06, 89.08 53.66, 103.36 36.85 M51.92 102.11 C64.92 85.06, 79.08 69.04, 105.06 40.98 M51.92 102.11 C69.87 81.69, 86.43 62.92, 105.06 40.98 M56.91 102.47 C74.21 81.4, 95.44 61.92, 107.43 44.36 M56.91 102.47 C74.44 82.54, 91.49 63.29, 107.43 44.36 M61.9 102.83 C72.73 88.93, 87.32 73.23, 107.17 50.76 M61.9 102.83 C75.16 87.47, 88.12 72.67, 107.17 50.76 M65.57 104.7 C77.68 91.55, 90.91 77.38, 106.9 57.16 M65.57 104.7 C74.19 95.24, 81.45 85.83, 106.9 57.16 M73.84 101.29 C83.36 88.9, 90.72 78.71, 105.99 64.31 M73.84 101.29 C83.3 92.16, 91.97 82.11, 105.99 64.31 M82.11 97.88 C90.01 90.6, 96.67 80.61, 105.07 71.46 M82.11 97.88 C87.38 93.21, 92.3 87.78, 105.07 71.46" stroke="#ffec99" stroke-width="0.5" fill="none"></path><path d="M69.77 2.01 C78.04 3.92, 87.67 10.87, 93.6 17.53 C99.54 24.2, 103.8 33.36, 105.38 42.02 C106.96 50.67, 105.85 61.15, 103.09 69.47 C100.33 77.79, 95.53 86.48, 88.82 91.95 C82.11 97.43, 71.54 100.88, 62.85 102.33 C54.16 103.79, 44.9 103.41, 36.68 100.69 C28.46 97.97, 19.56 92.31, 13.52 86 C7.48 79.68, 2.2 71.3, 0.44 62.79 C-1.31 54.28, -0.02 43.28, 2.98 34.92 C5.97 26.57, 11.89 18.22, 18.4 12.64 C24.92 7.06, 32.91 2.83, 42.07 1.44 C51.23 0.05, 67.99 3.74, 73.35 4.3 C78.72 4.86, 74.82 4.15, 74.26 4.79 M59.88 -0.13 C68.13 0.34, 77.27 5.21, 84.09 10.45 C90.91 15.68, 97.09 23.32, 100.8 31.27 C104.52 39.22, 107.45 49.22, 106.39 58.14 C105.33 67.06, 100.13 77.97, 94.42 84.78 C88.71 91.58, 80.22 95.99, 72.14 98.99 C64.07 101.99, 54.47 103.82, 45.96 102.77 C37.44 101.73, 28.1 97.76, 21.04 92.75 C13.99 87.73, 7.07 80.8, 3.64 72.68 C0.21 64.57, -0.55 52.87, 0.45 44.06 C1.44 35.25, 4.07 26.38, 9.62 19.82 C15.17 13.25, 25.21 8.03, 33.75 4.68 C42.29 1.33, 56.55 0.32, 60.85 -0.28 C65.16 -0.88, 60.01 0.21, 59.59 1.1" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g stroke-linecap="round" transform="translate(224.59773433464193 222.93847350215742) rotate(0 53.096346639499075 51.99017275117615)"><path d="M12.25 19.92 C12.25 19.92, 12.25 19.92, 12.25 19.92 M12.25 19.92 C12.25 19.92, 12.25 19.92, 12.25 19.92 M6.08 33.11 C13.53 23.81, 20.5 16.83, 26.42 9.71 M6.08 33.11 C10.26 28.24, 13.95 24.09, 26.42 9.71 M1.88 44.04 C7.26 37.5, 14.29 28.35, 36.65 4.04 M1.88 44.04 C12.76 30.76, 23.77 18.05, 36.65 4.04 M2.28 49.68 C11.24 35.86, 25.28 24.12, 42.3 3.64 M2.28 49.68 C13.65 37.39, 24.86 24.28, 42.3 3.64 M2.67 55.32 C20.17 38.47, 35.41 15.96, 48.6 2.49 M2.67 55.32 C13.58 44, 24.95 31.54, 48.6 2.49 M3.07 60.97 C23.47 38, 44.24 16.13, 54.89 1.34 M3.07 60.97 C18.52 42.75, 35.24 25.85, 54.89 1.34 M4.12 65.85 C24.03 41.89, 48.35 17.62, 60.54 0.95 M4.12 65.85 C20.08 47.55, 36.47 30.35, 60.54 0.95 M5.17 70.74 C18.78 54.36, 31.41 40.28, 64.87 2.06 M5.17 70.74 C17.93 56.92, 31.04 42.5, 64.87 2.06 M7.53 74.12 C32.07 45.76, 55.03 19.83, 69.2 3.18 M7.53 74.12 C26.67 51.52, 44.12 31.47, 69.2 3.18 M9.89 77.5 C22.03 61.96, 38.71 44.22, 72.87 5.05 M9.89 77.5 C25.62 59.33, 39.82 43.07, 72.87 5.05 M12.26 80.88 C36.18 52.96, 63.48 22.84, 76.55 6.92 M12.26 80.88 C35.65 55.28, 59.04 28.11, 76.55 6.92 M14.62 84.26 C31.72 63.75, 52.85 41.22, 80.22 8.79 M14.62 84.26 C36.47 59.73, 57.55 33.87, 80.22 8.79 M16.98 87.64 C29.38 71.98, 43.54 57.25, 83.9 10.66 M16.98 87.64 C37.01 63.37, 58.04 40.64, 83.9 10.66 M19.34 91.02 C41.77 63.18, 69.47 34.45, 87.57 12.53 M19.34 91.02 C37.9 70.62, 56.21 47.87, 87.57 12.53 M22.36 93.64 C46.05 67.1, 70.91 38.58, 89.94 15.91 M22.36 93.64 C47.89 64.09, 72.19 36.44, 89.94 15.91 M26.69 94.76 C42.23 76.71, 55.97 59.26, 92.3 19.28 M26.69 94.76 C41.4 79.75, 54.39 64.15, 92.3 19.28 M30.37 96.63 C55.03 68.25, 78.9 38.27, 94.66 22.66 M30.37 96.63 C54.74 68.83, 79.66 40.3, 94.66 22.66 M34.04 98.49 C48.38 82.16, 60.12 66.98, 97.03 26.04 M34.04 98.49 C52.85 77.64, 70.92 55.38, 97.03 26.04 M38.37 99.61 C57.43 73.94, 80.21 52.23, 99.39 29.42 M38.37 99.61 C60.73 73.61, 83.52 47.17, 99.39 29.42 M42.05 101.48 C62.7 73.76, 87.32 49.86, 101.75 32.8 M42.05 101.48 C57.71 84.05, 72.5 66.36, 101.75 32.8 M45.72 103.35 C64.16 83.16, 81.72 64.16, 103.46 36.93 M45.72 103.35 C66.52 81.5, 85.31 58.33, 103.46 36.93 M52.02 102.2 C70.69 80.32, 88.61 56.3, 103.85 42.58 M52.02 102.2 C65.21 87.85, 79.42 72.62, 103.85 42.58 M57.67 101.8 C74.68 80.87, 96.11 58.58, 104.9 47.47 M57.67 101.8 C70 87.44, 84.28 72.9, 104.9 47.47 M63.31 101.41 C78.86 81.24, 95.03 64.63, 105.95 52.35 M63.31 101.41 C79.48 84.91, 94.37 66.22, 105.95 52.35 M69.61 100.26 C78.96 91.3, 87.13 81.9, 106.35 58 M69.61 100.26 C83.69 84.5, 97.46 69.12, 106.35 58 M79.19 95.34 C87.69 85.5, 94.76 74.52, 101.49 69.68 M79.19 95.34 C86.09 86.15, 95.05 77.4, 101.49 69.68 M92.7 85.89 C93.52 85.21, 93.94 84.86, 94.67 83.62 M92.7 85.89 C93.2 85.32, 93.68 84.8, 94.67 83.62" stroke="#ffec99" stroke-width="0.5" fill="none"></path><path d="M34.63 3.97 C42.44 0.29, 53.26 -1.08, 61.86 0.14 C70.46 1.36, 79.55 5.82, 86.23 11.29 C92.91 16.76, 98.59 24.94, 101.93 32.95 C105.27 40.96, 107.64 50.64, 106.25 59.35 C104.86 68.07, 99.22 78.47, 93.59 85.22 C87.96 91.96, 80.47 96.87, 72.45 99.83 C64.44 102.79, 54.11 104.23, 45.48 102.98 C36.85 101.74, 27.54 97.88, 20.65 92.35 C13.76 86.83, 7.36 78.06, 4.15 69.84 C0.93 61.61, -0.04 51.36, 1.35 42.99 C2.74 34.63, 6.11 26.44, 12.49 19.64 C18.87 12.84, 34.01 5.37, 39.62 2.2 C45.23 -0.97, 45.85 -0.2, 46.16 0.62 M70.03 3.42 C77.85 5.4, 85.58 10.9, 91.37 16.93 C97.17 22.96, 102.99 31.16, 104.81 39.61 C106.62 48.06, 104.85 59.04, 102.27 67.64 C99.7 76.24, 95.65 85.2, 89.35 91.21 C83.06 97.21, 73.35 101.97, 64.48 103.68 C55.61 105.39, 44.82 104.4, 36.13 101.45 C27.44 98.51, 18.02 92.57, 12.34 86.01 C6.66 79.45, 3.82 70.61, 2.05 62.08 C0.27 53.54, -1.07 43.1, 1.69 34.78 C4.44 26.46, 11.97 17.72, 18.58 12.16 C25.19 6.6, 33.07 3.02, 41.33 1.42 C49.59 -0.18, 63.28 2.12, 68.15 2.57 C73.01 3.03, 70.33 3.41, 70.5 4.13" stroke="#1971c2" stroke-width="1" fill="none"></path></g></svg>
- name: simple-deployment.svg
  content: >-
    <svg version="1.1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 547.198046571021 238.54692721486435" width="547.198046571021" height="238.54692721486435">
    <!-- svg-source:excalidraw -->

    <defs>
    <style class="style-fonts">
    @font-face {
    font-family: Virgil;
    src: url(data:font/woff2;base64,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);
    }
    </style>

    </defs>
    <g stroke-linecap="round" transform="translate(389.69804657102077 10) rotate(0 25.83333333333337 24.16666666666663)"><path d="M6.21 9.37 C6.21 9.37, 6.21 9.37, 6.21 9.37 M6.21 9.37 C6.21 9.37, 6.21 9.37, 6.21 9.37 M0.7 21.81 C3.84 16.1, 7.97 13.59, 17.1 2.94 M0.7 21.81 C6.39 14.95, 12.93 6.61, 17.1 2.94 M1.75 26.69 C9.05 19.24, 16.12 12.35, 23.4 1.79 M1.75 26.69 C5.48 21.55, 10.3 16.36, 23.4 1.79 M3.45 30.83 C13.35 23.88, 19.92 13.24, 28.38 2.15 M3.45 30.83 C11.52 21.74, 20.53 11.24, 28.38 2.15 M5.82 34.21 C15.91 24.59, 21.38 15.62, 32.71 3.26 M5.82 34.21 C13.47 27.23, 19.98 18.79, 32.71 3.26 M6.87 39.09 C18.93 25.37, 29.14 14.38, 38.36 2.87 M6.87 39.09 C14.1 31.24, 18.99 24.1, 38.36 2.87 M10.54 40.96 C15.82 35.48, 24.84 27.65, 40.72 6.25 M10.54 40.96 C17.51 33.17, 24.59 25.48, 40.72 6.25 M14.22 42.83 C21.13 35.36, 27.52 27.68, 43.74 8.87 M14.22 42.83 C26.08 30.24, 38.02 15.25, 43.74 8.87 M17.24 45.46 C22.78 39.62, 28.55 30.15, 46.1 12.25 M17.24 45.46 C26.16 35.65, 33.33 28.47, 46.1 12.25 M20.91 47.33 C30.55 37.26, 40.52 26.28, 49.12 14.87 M20.91 47.33 C28.41 38.84, 35.93 30.66, 49.12 14.87 M23.93 49.95 C29.7 42.08, 37.68 34.27, 51.48 18.25 M23.93 49.95 C33.31 38.62, 43.28 27.28, 51.48 18.25 M30.23 48.8 C36.23 43.74, 38.3 38.51, 51.88 23.9 M30.23 48.8 C37.2 40.01, 44.93 31.94, 51.88 23.9 M39.15 44.63 C45.11 38.89, 47 37.34, 52.27 29.54 M39.15 44.63 C43.89 39.54, 48.69 34.11, 52.27 29.54" stroke="#b2f2bb" stroke-width="0.5" fill="none"></path><path d="M22.01 0.27 C27.02 -0.72, 33.44 0.5, 38.03 3.14 C42.62 5.77, 47.51 11.06, 49.56 16.06 C51.61 21.06, 52.09 28.45, 50.34 33.15 C48.6 37.85, 43.88 41.89, 39.09 44.28 C34.3 46.68, 27.04 48.46, 21.61 47.53 C16.18 46.61, 10.18 42.51, 6.49 38.74 C2.8 34.97, -0.5 29.84, -0.53 24.92 C-0.56 20.01, 1.8 13.38, 6.31 9.25 C10.82 5.12, 22.45 1.35, 26.54 0.14 C30.63 -1.08, 30.88 1.52, 30.86 1.95 M20.81 0.82 C26.13 -0.64, 33.71 -0.56, 38.55 1.78 C43.39 4.13, 47.71 9.77, 49.84 14.87 C51.98 19.98, 53.14 27.37, 51.35 32.42 C49.56 37.48, 44.02 42.39, 39.12 45.19 C34.22 48, 27.6 50.1, 21.95 49.25 C16.29 48.4, 8.82 44.02, 5.19 40.09 C1.56 36.16, -0.14 30.69, 0.17 25.66 C0.47 20.63, 3.64 13.9, 7.02 9.92 C10.4 5.93, 18.15 3.25, 20.46 1.73 C22.77 0.22, 20.61 0.72, 20.86 0.83" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g stroke-linecap="round" transform="translate(302.198046571021 126.88026054819773) rotate(0 117.5 50.833333333333314)"><path d="M3.67 9.82 C3.67 9.82, 3.67 9.82, 3.67 9.82 M3.67 9.82 C3.67 9.82, 3.67 9.82, 3.67 9.82 M0.79 19.23 C4.73 17.42, 5.91 12.37, 15.22 2.63 M0.79 19.23 C5.59 13.02, 10.32 7.21, 15.22 2.63 M0.52 25.63 C6.02 17.29, 12.26 9.71, 21.52 1.48 M0.52 25.63 C8.44 17.49, 14.3 8.56, 21.52 1.48 M0.26 32.03 C6.96 21.63, 17.1 14.19, 27.82 0.33 M0.26 32.03 C9.28 21.9, 16.5 12.07, 27.82 0.33 M0.66 37.67 C9.24 25.77, 16.85 19.78, 33.46 -0.06 M0.66 37.67 C8.39 27.91, 16.28 20.51, 33.46 -0.06 M0.4 44.07 C11.06 30.87, 21.98 18, 38.45 0.3 M0.4 44.07 C14.43 27.33, 27.31 12.12, 38.45 0.3 M0.79 49.71 C14.58 30.41, 31.8 14.26, 44.09 -0.1 M0.79 49.71 C17.36 29.46, 35.11 10.17, 44.09 -0.1 M0.53 56.11 C16.53 40.82, 28.67 23.71, 49.08 0.26 M0.53 56.11 C16.32 37.58, 33.34 18.41, 49.08 0.26 M0.27 62.51 C18.91 38.25, 39.26 17.32, 54.72 -0.13 M0.27 62.51 C15.76 44.77, 32.8 26.82, 54.72 -0.13 M0.66 68.15 C22.51 42.14, 44.61 18.9, 59.71 0.23 M0.66 68.15 C22.67 42.73, 45.79 15.7, 59.71 0.23 M0.4 74.55 C18.78 52.9, 36.1 34.48, 65.35 -0.17 M0.4 74.55 C17.59 54.43, 33.38 36.26, 65.35 -0.17 M0.8 80.19 C26.55 52.01, 52.44 22.23, 70.34 0.19 M0.8 80.19 C18.47 57.78, 37.14 36.79, 70.34 0.19 M1.85 85.08 C32 50.5, 60.53 19.83, 75.98 -0.2 M1.85 85.08 C27.85 55.52, 52.58 25.29, 75.98 -0.2 M2.9 89.97 C35.08 54.71, 64.35 20.66, 80.97 0.16 M2.9 89.97 C31.65 57.14, 58.59 24.56, 80.97 0.16 M5.26 93.35 C22.98 75.03, 41.68 51.66, 86.61 -0.24 M5.26 93.35 C27.61 66.33, 50.51 41.35, 86.61 -0.24 M7.62 96.73 C32.14 68.54, 56.06 40.74, 91.6 0.12 M7.62 96.73 C26.76 74.28, 46.2 53.27, 91.6 0.12 M11.3 98.6 C45.99 58.07, 79.53 21.72, 97.24 -0.27 M11.3 98.6 C35.04 70.81, 58.83 43.78, 97.24 -0.27 M14.97 100.47 C39.32 75.07, 63.6 44.13, 102.23 0.09 M14.97 100.47 C46.62 62.86, 78.83 25.2, 102.23 0.09 M19.3 101.58 C51.35 68.27, 81.2 30.69, 107.87 -0.31 M19.3 101.58 C41.97 77.88, 65.14 52, 107.87 -0.31 M24.29 101.94 C49.4 75.93, 73.47 45.22, 112.86 0.06 M24.29 101.94 C54.69 66.67, 85.72 29.54, 112.86 0.06 M29.93 101.55 C48.11 80.69, 68.15 60.76, 118.5 -0.34 M29.93 101.55 C66.69 59.94, 100.95 19.76, 118.5 -0.34 M34.92 101.91 C58.37 76.86, 77.59 51.69, 123.49 0.02 M34.92 101.91 C59.21 73.45, 83.46 45.33, 123.49 0.02 M40.56 101.51 C70.46 69.83, 97.51 36.52, 128.48 0.38 M40.56 101.51 C59.22 80.68, 78.41 58.58, 128.48 0.38 M45.55 101.87 C65.86 76.21, 86.89 51.62, 134.12 -0.01 M45.55 101.87 C68.89 74.44, 94.26 46.02, 134.12 -0.01 M50.54 102.23 C83.56 65.84, 114.45 25.73, 139.11 0.35 M50.54 102.23 C77.01 72.74, 100.57 44.92, 139.11 0.35 M56.18 101.84 C86.55 70.25, 114.27 35.41, 144.75 -0.05 M56.18 101.84 C75.63 79.9, 95.47 56.97, 144.75 -0.05 M61.17 102.2 C95.03 62.35, 131.15 22.49, 149.74 0.31 M61.17 102.2 C85.03 72.39, 109.54 45.57, 149.74 0.31 M66.81 101.8 C89.89 75.98, 111.23 50.85, 155.38 -0.08 M66.81 101.8 C87.25 80.26, 106.25 57.28, 155.38 -0.08 M71.8 102.16 C107.63 58.86, 142.17 19.9, 160.37 0.28 M71.8 102.16 C103.33 66.56, 135.61 30.3, 160.37 0.28 M77.44 101.77 C100.99 77.15, 119.59 51.7, 166.01 -0.12 M77.44 101.77 C111.81 63.76, 144.15 25.83, 166.01 -0.12 M82.43 102.13 C110.87 68.7, 143.05 31.29, 171 0.24 M82.43 102.13 C114.06 64.52, 148.58 27.91, 171 0.24 M88.07 101.73 C117.26 65.35, 147.06 31.89, 176.64 -0.15 M88.07 101.73 C118.01 67.01, 148.13 34.55, 176.64 -0.15 M93.06 102.09 C122.31 64.52, 153.42 31.08, 181.63 0.21 M93.06 102.09 C118.46 75.1, 142.38 46.52, 181.63 0.21 M98.7 101.7 C127.05 72.45, 152.06 38.34, 187.27 -0.19 M98.7 101.7 C131.94 63.75, 165.82 25.36, 187.27 -0.19 M103.69 102.06 C130.1 71.02, 160.29 40.27, 192.26 0.17 M103.69 102.06 C130.36 70.47, 156.25 41, 192.26 0.17 M109.33 101.66 C134.1 74.83, 159.14 45.66, 197.9 -0.22 M109.33 101.66 C140.37 66.34, 172.3 29.49, 197.9 -0.22 M114.32 102.02 C134.38 75.79, 158.67 52.46, 202.89 0.14 M114.32 102.02 C147.4 65.12, 180.86 25.04, 202.89 0.14 M119.96 101.63 C148.75 67.44, 180.97 31.35, 208.53 -0.26 M119.96 101.63 C148.03 70.79, 176.48 39.4, 208.53 -0.26 M124.95 101.99 C159.13 65.1, 191.36 26.03, 212.86 0.86 M124.95 101.99 C152.14 68.58, 180.92 37.76, 212.86 0.86 M130.59 101.6 C163.21 61.2, 197.14 25.82, 217.85 1.22 M130.59 101.6 C155.33 73.39, 180.74 44.21, 217.85 1.22 M135.58 101.96 C155.93 76.62, 178.48 53.41, 222.18 2.33 M135.58 101.96 C154.36 78.39, 173.45 57.24, 222.18 2.33 M141.22 101.56 C174.15 64.41, 203.24 28.45, 225.2 4.96 M141.22 101.56 C167.03 70.41, 194.07 40.91, 225.2 4.96 M146.21 101.92 C175.52 68.18, 208.55 29.5, 228.87 6.83 M146.21 101.92 C171.58 71.99, 195.03 44.67, 228.87 6.83 M151.85 101.53 C177.24 70.34, 205.95 38.62, 231.23 10.21 M151.85 101.53 C183.82 64.18, 215.35 28.73, 231.23 10.21 M156.84 101.89 C174.37 80.51, 193.65 59.46, 233.6 13.59 M156.84 101.89 C175.63 80.5, 192.89 60.92, 233.6 13.59 M161.83 102.25 C186.11 73.48, 211.67 42.57, 234.65 18.47 M161.83 102.25 C188.03 72.05, 215.45 42.02, 234.65 18.47 M167.47 101.85 C185.89 79.23, 207.66 56.7, 235.04 24.12 M167.47 101.85 C180.88 85.17, 194.97 70.66, 235.04 24.12 M172.46 102.21 C193.64 77.98, 216.14 51.92, 234.78 30.52 M172.46 102.21 C197.29 72.89, 221.88 44.85, 234.78 30.52 M178.1 101.82 C197.69 79.19, 213.57 60.56, 235.18 36.16 M178.1 101.82 C194.72 82.88, 209.9 64.25, 235.18 36.16 M183.09 102.18 C200.22 80.86, 219.67 60.99, 234.91 42.56 M183.09 102.18 C198.49 84.2, 213.98 67.22, 234.91 42.56 M188.73 101.78 C203.06 87.15, 213.09 75.03, 235.31 48.2 M188.73 101.78 C200.09 89.85, 211 76.9, 235.31 48.2 M193.72 102.14 C209.58 84.22, 225.03 66, 235.05 54.6 M193.72 102.14 C202.38 90.71, 213.39 80.49, 235.05 54.6 M199.36 101.75 C209.16 90.64, 219.09 78.47, 235.44 60.24 M199.36 101.75 C210.53 88.61, 220.65 77.58, 235.44 60.24 M204.35 102.11 C209.97 96.04, 216.43 86.02, 235.18 66.64 M204.35 102.11 C215.53 89.36, 228.67 74.24, 235.18 66.64 M209.99 101.71 C221.6 91.74, 230.99 80.57, 235.57 72.28 M209.99 101.71 C214.98 94.73, 220.02 88.41, 235.57 72.28 M216.29 100.57 C221.63 95.36, 224.96 92.51, 235.31 78.68 M216.29 100.57 C221.99 93.46, 228.83 86.48, 235.31 78.68 M223.24 98.66 C227.46 94.51, 229.11 91.39, 234.4 85.83 M223.24 98.66 C225.16 95.42, 227.5 92.21, 234.4 85.83" stroke="#ffc9c9" stroke-width="0.5" fill="none"></path><path d="M25.42 0 C91.06 -0.35, 160.24 0.27, 209.58 0 M25.42 0 C61.91 0.55, 99.87 0.58, 209.58 0 M209.58 0 C228.14 -1.62, 235.53 9.56, 235 25.42 M209.58 0 C224.37 0.98, 233.03 10.06, 235 25.42 M235 25.42 C236.78 43.42, 235.49 57.83, 235 76.25 M235 25.42 C234.2 42.96, 234.83 59.23, 235 76.25 M235 76.25 C234.88 91.82, 228.09 103.63, 209.58 101.67 M235 76.25 C234.65 92.66, 226.32 100.34, 209.58 101.67 M209.58 101.67 C164.72 105.34, 117.36 104.03, 25.42 101.67 M209.58 101.67 C142.62 104.3, 76.97 102.48, 25.42 101.67 M25.42 101.67 C7.92 100.3, 1.31 91.95, 0 76.25 M25.42 101.67 C6.32 100.96, -1.82 93.74, 0 76.25 M0 76.25 C1.38 67.06, -1.19 53.37, 0 25.42 M0 76.25 C0.33 62.26, -0.71 47.78, 0 25.42 M0 25.42 C1.74 8.42, 9.08 -0.47, 25.42 0 M0 25.42 C0.88 10.62, 7.41 -0.01, 25.42 0" stroke="#e03131" stroke-width="1" fill="none"></path></g><g transform="translate(403.22806060910693 165.2135938815311) rotate(0 16.469985961914062 12.5)"><text x="16.469985961914062" y="17.619999999999997" font-family="Virgil, Segoe UI Emoji" font-size="20px" fill="#1971c2" text-anchor="middle" style="white-space: pre;" direction="ltr" dominant-baseline="alphabetic">pod</text></g><g stroke-linecap="round"><g transform="translate(416.3489089732939 64.40286864240136) rotate(0 -0.3892695829841841 28.440960205100282)"><path d="M1.18 -1 C1.14 8.49, 0.77 48.07, 0.42 57.65 M0.34 1.08 C0.19 10.19, 0.46 46.52, 0.1 55.93" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(416.3489089732939 64.40286864240136) rotate(0 -0.3892695829841841 28.440960205100282)"><path d="M-8.15 32.33 C-6.79 42.57, -0.92 48.59, 0.1 55.93 M-8.15 32.33 C-5.45 37.87, -3.04 44.94, 0.1 55.93" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(416.3489089732939 64.40286864240136) rotate(0 -0.3892695829841841 28.440960205100282)"><path d="M8.95 32.55 C4.28 42.88, 4.11 48.82, 0.1 55.93 M8.95 32.55 C7.14 37.96, 5.03 44.96, 0.1 55.93" stroke="#1971c2" stroke-width="1" fill="none"></path></g></g><mask></mask><g stroke-linecap="round" transform="translate(10 13.131933728023455) rotate(0 117.5 50.833333333333314)"><path d="M3.67 9.82 C3.67 9.82, 3.67 9.82, 3.67 9.82 M3.67 9.82 C3.67 9.82, 3.67 9.82, 3.67 9.82 M0.79 19.23 C7.62 11.87, 11.86 8.25, 15.22 2.63 M0.79 19.23 C5.07 13.97, 10.97 7.61, 15.22 2.63 M0.52 25.63 C5.5 17.35, 13.51 11.33, 21.52 1.48 M0.52 25.63 C6.26 17.96, 13.7 12.11, 21.52 1.48 M0.26 32.03 C4.74 24.3, 14.33 18.77, 27.82 0.33 M0.26 32.03 C8.3 22.09, 17.59 13.19, 27.82 0.33 M0.66 37.67 C12.75 23.39, 24.38 10.46, 33.46 -0.06 M0.66 37.67 C10.02 25.47, 21.69 13.81, 33.46 -0.06 M0.4 44.07 C10.77 31.39, 20.62 20.85, 38.45 0.3 M0.4 44.07 C10.19 33.97, 18.66 23.29, 38.45 0.3 M0.79 49.71 C10.58 41.24, 17.43 28.29, 44.09 -0.1 M0.79 49.71 C15.95 32.11, 30.06 16.24, 44.09 -0.1 M0.53 56.11 C16.43 36.38, 36.89 15.95, 49.08 0.26 M0.53 56.11 C14.3 41.78, 26.44 25.78, 49.08 0.26 M0.27 62.51 C13.32 45.19, 29.79 26.88, 54.72 -0.13 M0.27 62.51 C17.1 42.3, 34.97 21.99, 54.72 -0.13 M0.66 68.15 C20.71 44.95, 42.88 19.33, 59.71 0.23 M0.66 68.15 C18.08 50.34, 33.5 30.07, 59.71 0.23 M0.4 74.55 C17.54 56.62, 32.12 37.33, 65.35 -0.17 M0.4 74.55 C25.37 46.76, 48.52 18.33, 65.35 -0.17 M0.8 80.19 C14.98 61.1, 32.17 43.22, 70.34 0.19 M0.8 80.19 C26.75 48.85, 54.32 18.39, 70.34 0.19 M1.85 85.08 C27.02 59.29, 51.37 31.96, 75.98 -0.2 M1.85 85.08 C17.45 65.03, 34.67 45.21, 75.98 -0.2 M2.9 89.97 C28.7 58.31, 60.31 24.34, 80.97 0.16 M2.9 89.97 C21.79 67.79, 41.34 45.01, 80.97 0.16 M5.26 93.35 C26.16 67.57, 48.12 45, 86.61 -0.24 M5.26 93.35 C35.04 59.96, 64.16 26.79, 86.61 -0.24 M7.62 96.73 C27.98 72.51, 46.69 48.67, 91.6 0.12 M7.62 96.73 C38.49 61.78, 67.7 26.72, 91.6 0.12 M11.3 98.6 C43.31 60.59, 75.09 20.99, 97.24 -0.27 M11.3 98.6 C38.72 69.3, 62.61 40.28, 97.24 -0.27 M14.97 100.47 C47.97 60.83, 83.11 23.89, 102.23 0.09 M14.97 100.47 C47.48 62.36, 80.29 23.92, 102.23 0.09 M19.3 101.58 C50.24 64.02, 83.17 23.89, 107.87 -0.31 M19.3 101.58 C45.57 70.74, 70.43 42.4, 107.87 -0.31 M24.29 101.94 C58.67 60.28, 93.18 20.07, 112.86 0.06 M24.29 101.94 C55.77 65.33, 87.31 29.86, 112.86 0.06 M29.93 101.55 C52.69 74.07, 75.88 45.29, 118.5 -0.34 M29.93 101.55 C51.93 75.68, 75.24 49.54, 118.5 -0.34 M34.92 101.91 C61.26 70.08, 88.01 39.5, 123.49 0.02 M34.92 101.91 C65.6 65.51, 97.34 29.63, 123.49 0.02 M40.56 101.51 C67.01 74.81, 89.44 44.08, 128.48 0.38 M40.56 101.51 C58.43 79.1, 78.33 58.9, 128.48 0.38 M45.55 101.87 C65.35 79.36, 83.3 61.21, 134.12 -0.01 M45.55 101.87 C78.95 61.46, 113.2 21.64, 134.12 -0.01 M50.54 102.23 C81.85 65.3, 112.77 33.04, 139.11 0.35 M50.54 102.23 C74.43 73.48, 98.57 47.22, 139.11 0.35 M56.18 101.84 C79.61 72.28, 104.6 43.85, 144.75 -0.05 M56.18 101.84 C83.15 71.47, 109.03 40.89, 144.75 -0.05 M61.17 102.2 C97.1 62.43, 131.33 22.12, 149.74 0.31 M61.17 102.2 C81.95 78.52, 102.25 53.95, 149.74 0.31 M66.81 101.8 C97.36 66.12, 129.89 31.86, 155.38 -0.08 M66.81 101.8 C93.11 70.9, 120.15 40.71, 155.38 -0.08 M71.8 102.16 C99.67 69.05, 128.75 36.59, 160.37 0.28 M71.8 102.16 C104.15 64.53, 137.79 25.51, 160.37 0.28 M77.44 101.77 C102.12 71.01, 126.63 42.5, 166.01 -0.12 M77.44 101.77 C94.44 80.17, 113.31 58.15, 166.01 -0.12 M82.43 102.13 C110.72 67.77, 140.54 35.03, 171 0.24 M82.43 102.13 C106.79 74.5, 130.27 46.45, 171 0.24 M88.07 101.73 C111.31 75.31, 133.18 50.81, 176.64 -0.15 M88.07 101.73 C106.45 78.52, 126.57 56.31, 176.64 -0.15 M93.06 102.09 C116.22 76.28, 138 54.01, 181.63 0.21 M93.06 102.09 C113.91 80.28, 133.17 58.8, 181.63 0.21 M98.7 101.7 C120.75 79.69, 139.79 56.49, 187.27 -0.19 M98.7 101.7 C126.78 69.42, 154.76 36.83, 187.27 -0.19 M103.69 102.06 C121.93 82.8, 138.06 62, 192.26 0.17 M103.69 102.06 C136.72 65.61, 166.52 30.62, 192.26 0.17 M109.33 101.66 C132.41 72.35, 158.17 46.7, 197.9 -0.22 M109.33 101.66 C135.65 71.22, 161.77 42.58, 197.9 -0.22 M114.32 102.02 C143.92 67.62, 174.35 33.71, 202.89 0.14 M114.32 102.02 C142.4 67.36, 172.15 34.02, 202.89 0.14 M119.96 101.63 C148.83 69.32, 174.13 36.79, 208.53 -0.26 M119.96 101.63 C146.74 70.89, 174.52 40.25, 208.53 -0.26 M124.95 101.99 C152.94 69.56, 177.94 37.46, 212.86 0.86 M124.95 101.99 C152.44 73.15, 178.48 41.08, 212.86 0.86 M130.59 101.6 C158.15 66.66, 189.87 34.58, 217.85 1.22 M130.59 101.6 C157.86 70.32, 184.13 38.24, 217.85 1.22 M135.58 101.96 C167.26 65.76, 199.12 32.82, 222.18 2.33 M135.58 101.96 C161.73 71.45, 186.87 42.63, 222.18 2.33 M141.22 101.56 C170.81 64.38, 205.22 27.72, 225.2 4.96 M141.22 101.56 C165.37 73.54, 188.72 44.71, 225.2 4.96 M146.21 101.92 C168.04 76.19, 189.94 49.09, 228.87 6.83 M146.21 101.92 C164.4 79.89, 182.98 59.06, 228.87 6.83 M151.85 101.53 C178.86 70.16, 204.4 42.49, 231.23 10.21 M151.85 101.53 C180.83 68.23, 209.04 33.6, 231.23 10.21 M156.84 101.89 C172.65 85.24, 189.11 64.76, 233.6 13.59 M156.84 101.89 C181.96 75.26, 205.59 48.49, 233.6 13.59 M161.83 102.25 C189.24 72.84, 213.39 44.22, 234.65 18.47 M161.83 102.25 C182.7 78.44, 202.18 54.8, 234.65 18.47 M167.47 101.85 C185.78 80.45, 205.92 55.16, 235.04 24.12 M167.47 101.85 C185.73 81.88, 202.57 61.55, 235.04 24.12 M172.46 102.21 C190.11 82.15, 206.87 63.75, 234.78 30.52 M172.46 102.21 C194.2 76.25, 216.39 52.98, 234.78 30.52 M178.1 101.82 C200.24 77.36, 221.73 50.4, 235.18 36.16 M178.1 101.82 C193.25 84.76, 208.65 66.97, 235.18 36.16 M183.09 102.18 C198.92 82.54, 219.77 62.65, 234.91 42.56 M183.09 102.18 C197.84 84.32, 213.95 67.07, 234.91 42.56 M188.73 101.78 C204.32 87.76, 218.37 71.4, 235.31 48.2 M188.73 101.78 C197.65 90.09, 208.87 79.27, 235.31 48.2 M193.72 102.14 C204.79 88.16, 221.44 70.79, 235.05 54.6 M193.72 102.14 C203.12 91.95, 211.76 80.94, 235.05 54.6 M199.36 101.75 C207.09 92.94, 216.24 79.82, 235.44 60.24 M199.36 101.75 C208.12 90.76, 218.2 79.58, 235.44 60.24 M204.35 102.11 C216.92 86.46, 228.57 76.21, 235.18 66.64 M204.35 102.11 C211.26 94.31, 216.71 86.81, 235.18 66.64 M209.99 101.71 C219.67 91.61, 230.76 79.15, 235.57 72.28 M209.99 101.71 C218.74 92.55, 226.23 82.49, 235.57 72.28 M216.29 100.57 C220.73 97.58, 224.61 92.1, 235.31 78.68 M216.29 100.57 C223.71 92.61, 230.24 83.34, 235.31 78.68 M223.24 98.66 C226.96 95.44, 230.76 88.72, 234.4 85.83 M223.24 98.66 C226.97 94.41, 230.63 90.2, 234.4 85.83" stroke="#ffc9c9" stroke-width="0.5" fill="none"></path><path d="M25.42 0 C64.27 0.19, 106.64 -1.76, 209.58 0 M25.42 0 C77.66 0.75, 131.11 1.66, 209.58 0 M209.58 0 C225.35 0.57, 235.11 9.07, 235 25.42 M209.58 0 C224.49 -0.93, 235.3 8.32, 235 25.42 M235 25.42 C237.22 36.71, 234.91 50.03, 235 76.25 M235 25.42 C234.81 39.47, 235.68 52.04, 235 76.25 M235 76.25 C234.42 92.45, 226.96 101.85, 209.58 101.67 M235 76.25 C236.3 94.08, 226.76 99.78, 209.58 101.67 M209.58 101.67 C136.85 101.25, 65.48 100.36, 25.42 101.67 M209.58 101.67 C148.49 103.04, 87.7 103.13, 25.42 101.67 M25.42 101.67 C8.85 100.72, 0.24 91.52, 0 76.25 M25.42 101.67 C10 103.35, -0.75 93.5, 0 76.25 M0 76.25 C-1.2 60.5, -1.6 46.93, 0 25.42 M0 76.25 C0.84 59.45, 0.41 44.24, 0 25.42 M0 25.42 C-0.3 10.39, 7.38 1.52, 25.42 0 M0 25.42 C-1.45 7.55, 9.92 2.05, 25.42 0" stroke="#e03131" stroke-width="1" fill="none"></path></g><g transform="translate(76.08004760742188 51.46526706135671) rotate(0 51.419952392578125 12.5)"><text x="51.419952392578125" y="17.619999999999997" font-family="Virgil, Segoe UI Emoji" font-size="20px" fill="#1971c2" text-anchor="middle" style="white-space: pre;" direction="ltr" dominant-baseline="alphabetic">deployment</text></g><g stroke-linecap="round"><g transform="translate(241.43591049725842 108.2122225942727) rotate(0 30.419781928879615 12.720999715713333)"><path d="M-0.67 -0.69 C9.66 3.59, 51.06 20.98, 61.36 25.42 M1.18 1.57 C11.45 6.07, 50.79 23.23, 60.69 26.95" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(241.43591049725842 108.2122225942727) rotate(0 30.419781928879615 12.720999715713333)"><path d="M35.71 25.94 C40.8 27.2, 48.15 27.13, 60.69 26.95 M35.71 25.94 C44.81 25.86, 52.71 26.43, 60.69 26.95" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(241.43591049725842 108.2122225942727) rotate(0 30.419781928879615 12.720999715713333)"><path d="M42.2 10.12 C45.64 15.3, 51.37 19.17, 60.69 26.95 M42.2 10.12 C48.94 15.52, 54.61 21.52, 60.69 26.95" stroke="#1971c2" stroke-width="1" fill="none"></path></g></g><mask></mask><g transform="translate(463.2409085204356 17.173876523347076) rotate(0 33.63996887207031 12.5)"><text x="0" y="17.619999999999997" font-family="Virgil, Segoe UI Emoji" font-size="20px" fill="#1971c2" text-anchor="start" style="white-space: pre;" direction="ltr" dominant-baseline="alphabetic">service</text></g></svg>
 ```
