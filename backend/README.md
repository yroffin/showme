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
  autoplay: 700
slides:
- id: bored
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
      <h1 class="slide-header">titre</h1>
      <div class="slide-body">
  - renderer: resource
    content: another.svg
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
      <h1 class="slide-header">titre</h1>
      <div class="slide-body">
  - renderer: resource
    content: another.svg
  - renderer: html
    content: >-
      </div>
      <h1 class="slide-footer">slide 2/3</h1>
- id: slide-003
  class: step slide
  data-x: 3000
  data-y: 500
  data-rotate-z: -25
  contents:
  - renderer: html
    content: >-
      <h1 class="slide-header">titre</h1>
      <div class="slide-body">
  - renderer: resource
    content: another.svg
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
- name: sample-002.svg
  content: >-
    <svg version="1.1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 611.6666666666667 373.3333333333335" width="611.6666666666667" height="373.3333333333335">
      <!-- svg-source:excalidraw -->

      <defs>
        <style class="style-fonts">
          @font-face {
            font-family: Virgil;
            src: url(data:font/woff2;base64,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);
              }
        </style>

      </defs>
      <g stroke-linecap="round" transform="translate(10 38.33333333333337) rotate(0 117.5 50.833333333333314)"><path d="M3.67 9.82 C3.67 9.82, 3.67 9.82, 3.67 9.82 M3.67 9.82 C3.67 9.82, 3.67 9.82, 3.67 9.82 M0.79 19.23 C6.1 14.97, 9.15 7.01, 15.22 2.63 M0.79 19.23 C4.34 14.7, 5.84 11.94, 15.22 2.63 M0.52 25.63 C9.75 18.08, 16.21 8.85, 21.52 1.48 M0.52 25.63 C4.39 21.15, 9.49 14.68, 21.52 1.48 M0.26 32.03 C4.38 23.76, 12.82 18.49, 27.82 0.33 M0.26 32.03 C8.18 22.81, 17.28 14.12, 27.82 0.33 M0.66 37.67 C10.84 24.24, 23.43 10.35, 33.46 -0.06 M0.66 37.67 C9.21 28.5, 17.84 18.26, 33.46 -0.06 M0.4 44.07 C11.4 30.74, 22.49 19.53, 38.45 0.3 M0.4 44.07 C8.71 34.19, 16.3 25.51, 38.45 0.3 M0.79 49.71 C13.67 35.94, 23.95 18.81, 44.09 -0.1 M0.79 49.71 C10.8 38.36, 20.93 27.19, 44.09 -0.1 M0.53 56.11 C11.51 42.07, 23.12 31.57, 49.08 0.26 M0.53 56.11 C9.89 44.06, 20.13 33.66, 49.08 0.26 M0.27 62.51 C16.05 46.76, 32.09 25.01, 54.72 -0.13 M0.27 62.51 C21.26 37.53, 40.13 13.91, 54.72 -0.13 M0.66 68.15 C15.43 49.92, 35.06 30.28, 59.71 0.23 M0.66 68.15 C19.12 47.38, 36.29 25.62, 59.71 0.23 M0.4 74.55 C23.03 46.7, 44.12 21.93, 65.35 -0.17 M0.4 74.55 C16.04 57, 31.28 39.68, 65.35 -0.17 M0.8 80.19 C16.42 62.34, 32.5 42.63, 70.34 0.19 M0.8 80.19 C20.12 57.32, 39.43 36.35, 70.34 0.19 M1.85 85.08 C32.27 50.15, 58.83 18.23, 75.98 -0.2 M1.85 85.08 C29.02 52.84, 57.19 21.29, 75.98 -0.2 M2.9 89.97 C27.9 60.05, 55.1 31.48, 80.97 0.16 M2.9 89.97 C23.43 66.87, 42.66 46.08, 80.97 0.16 M5.26 93.35 C36.11 56.36, 67.2 21.36, 86.61 -0.24 M5.26 93.35 C22.69 73.16, 41.26 52.6, 86.61 -0.24 M7.62 96.73 C37.97 63.13, 67.34 29.11, 91.6 0.12 M7.62 96.73 C34.94 66.41, 61.21 37.48, 91.6 0.12 M11.3 98.6 C44.24 59.84, 79.44 19.05, 97.24 -0.27 M11.3 98.6 C34 70.75, 59.01 44.95, 97.24 -0.27 M14.97 100.47 C42.32 69.15, 71.45 33.3, 102.23 0.09 M14.97 100.47 C42.46 68.46, 71.56 36.92, 102.23 0.09 M19.3 101.58 C55.73 61.45, 89.39 20.25, 107.87 -0.31 M19.3 101.58 C44.89 71.37, 71.6 40.49, 107.87 -0.31 M24.29 101.94 C44.92 78.16, 64.15 58.05, 112.86 0.06 M24.29 101.94 C48.91 72.6, 72.68 44.67, 112.86 0.06 M29.93 101.55 C51.84 73.44, 76.45 47.49, 118.5 -0.34 M29.93 101.55 C55.35 71.22, 80.79 40.29, 118.5 -0.34 M34.92 101.91 C51.78 82.23, 71.7 59.29, 123.49 0.02 M34.92 101.91 C64.92 66.7, 96.96 31.27, 123.49 0.02 M40.56 101.51 C66.72 69.79, 95.57 35.73, 128.48 0.38 M40.56 101.51 C71.43 64.89, 101.81 29.49, 128.48 0.38 M45.55 101.87 C68.45 71.68, 95.4 46.41, 134.12 -0.01 M45.55 101.87 C70.7 73.46, 94.62 45.77, 134.12 -0.01 M50.54 102.23 C69.05 80.66, 87.19 58.57, 139.11 0.35 M50.54 102.23 C85.83 62.8, 119.23 24.17, 139.11 0.35 M56.18 101.84 C89.06 63.78, 121.91 27.23, 144.75 -0.05 M56.18 101.84 C85.82 67.74, 115.33 33.82, 144.75 -0.05 M61.17 102.2 C87.02 73.16, 109.18 43.64, 149.74 0.31 M61.17 102.2 C96.12 60.55, 131.38 22.12, 149.74 0.31 M66.81 101.8 C87.8 76.14, 109.36 49.23, 155.38 -0.08 M66.81 101.8 C99.91 63.25, 132.81 25.85, 155.38 -0.08 M71.8 102.16 C102.19 67.23, 130.51 32.37, 160.37 0.28 M71.8 102.16 C93.4 77.52, 113.62 55.17, 160.37 0.28 M77.44 101.77 C97.8 74.98, 121.18 50.32, 166.01 -0.12 M77.44 101.77 C93.91 80.02, 113.49 59.72, 166.01 -0.12 M82.43 102.13 C106.06 73.22, 131.9 45.57, 171 0.24 M82.43 102.13 C98.82 81.21, 116.77 61.76, 171 0.24 M88.07 101.73 C114.46 73, 136.78 42.62, 176.64 -0.15 M88.07 101.73 C121.11 61.98, 154.41 22.85, 176.64 -0.15 M93.06 102.09 C119.63 67.53, 151.31 34.48, 181.63 0.21 M93.06 102.09 C118.48 73, 143.45 43.89, 181.63 0.21 M98.7 101.7 C123.01 71.35, 150.56 41.61, 187.27 -0.19 M98.7 101.7 C119.88 78.55, 140.8 53.52, 187.27 -0.19 M103.69 102.06 C136.04 62.63, 169.43 27.99, 192.26 0.17 M103.69 102.06 C130.9 71.12, 157.25 39.74, 192.26 0.17 M109.33 101.66 C144.11 61.82, 179.3 24.03, 197.9 -0.22 M109.33 101.66 C132.24 76.09, 155.23 49.84, 197.9 -0.22 M114.32 102.02 C147.97 64.56, 180.54 25.27, 202.89 0.14 M114.32 102.02 C144.58 66.53, 175.72 30.81, 202.89 0.14 M119.96 101.63 C144.8 75.62, 167.81 45.74, 208.53 -0.26 M119.96 101.63 C144.52 73.29, 170.86 44.54, 208.53 -0.26 M124.95 101.99 C143.95 77.46, 166.92 56.93, 212.86 0.86 M124.95 101.99 C156.44 64.21, 189.1 26.2, 212.86 0.86 M130.59 101.6 C150.7 80.45, 169.56 57.24, 217.85 1.22 M130.59 101.6 C157.72 69.47, 184.19 38.17, 217.85 1.22 M135.58 101.96 C159.53 71.12, 187.33 43.21, 222.18 2.33 M135.58 101.96 C167.77 65.09, 200.55 27.67, 222.18 2.33 M141.22 101.56 C171.07 68.74, 196.72 37.55, 225.2 4.96 M141.22 101.56 C166.49 71.31, 192.99 41.6, 225.2 4.96 M146.21 101.92 C165.12 79.12, 182.71 58.28, 228.87 6.83 M146.21 101.92 C164.64 81.6, 182.68 61.55, 228.87 6.83 M151.85 101.53 C173.41 76.26, 199.2 46.69, 231.23 10.21 M151.85 101.53 C168.28 83.49, 184.64 65.2, 231.23 10.21 M156.84 101.89 C186.12 69.23, 210.27 40.29, 233.6 13.59 M156.84 101.89 C175.64 81.86, 193.22 59.4, 233.6 13.59 M161.83 102.25 C188.31 72.54, 213.44 43.58, 234.65 18.47 M161.83 102.25 C180.86 79.36, 201.97 56.62, 234.65 18.47 M167.47 101.85 C188.74 77.89, 211.38 49.54, 235.04 24.12 M167.47 101.85 C182.31 83.97, 197.6 66.91, 235.04 24.12 M172.46 102.21 C197.06 77.09, 218.56 50.25, 234.78 30.52 M172.46 102.21 C195.8 77.4, 217.47 52.4, 234.78 30.52 M178.1 101.82 C195.45 82.86, 207.69 65.29, 235.18 36.16 M178.1 101.82 C189.4 87.73, 201.91 72.7, 235.18 36.16 M183.09 102.18 C203.46 78.98, 223.41 56.48, 234.91 42.56 M183.09 102.18 C195.25 87.43, 207.98 73.93, 234.91 42.56 M188.73 101.78 C199.23 89.37, 207.56 79.57, 235.31 48.2 M188.73 101.78 C203.49 85.08, 217.86 67.53, 235.31 48.2 M193.72 102.14 C202.83 91.76, 214.63 80.03, 235.05 54.6 M193.72 102.14 C206.65 88.29, 219.35 73.25, 235.05 54.6 M199.36 101.75 C205.58 91.17, 215.95 80.48, 235.44 60.24 M199.36 101.75 C209.59 90.64, 219.67 77.39, 235.44 60.24 M204.35 102.11 C214.66 89.58, 226.06 76.46, 235.18 66.64 M204.35 102.11 C211.91 92.09, 220.06 82.78, 235.18 66.64 M209.99 101.71 C219 93.2, 227.56 81.75, 235.57 72.28 M209.99 101.71 C219.57 91.74, 229.07 81.05, 235.57 72.28 M216.29 100.57 C222.23 91.8, 230.45 84.68, 235.31 78.68 M216.29 100.57 C223.37 92.96, 230.74 83.83, 235.31 78.68 M223.24 98.66 C224.8 94.69, 229.89 91.73, 234.4 85.83 M223.24 98.66 C225.24 96.09, 228.26 93.69, 234.4 85.83" stroke="#ffc9c9" stroke-width="0.5" fill="none"></path><path d="M25.42 0 C95.63 1.3, 162.73 1.75, 209.58 0 M25.42 0 C84.47 0.08, 144.21 0.79, 209.58 0 M209.58 0 C225.71 0.8, 234.76 6.95, 235 25.42 M209.58 0 C226.87 0.01, 234.71 8.15, 235 25.42 M235 25.42 C233.62 35.23, 233.45 45.83, 235 76.25 M235 25.42 C234.1 36.84, 235.31 50.39, 235 76.25 M235 76.25 C236.92 93.41, 225.62 103.3, 209.58 101.67 M235 76.25 C236.88 94.92, 227.04 103.7, 209.58 101.67 M209.58 101.67 C138.69 102.85, 70.63 100.01, 25.42 101.67 M209.58 101.67 C172.03 101.08, 133.69 100.23, 25.42 101.67 M25.42 101.67 C6.56 100.01, 1.57 93.05, 0 76.25 M25.42 101.67 C6.54 102.96, -0.23 94.46, 0 76.25 M0 76.25 C1.35 65.77, 1.2 55.06, 0 25.42 M0 76.25 C0.55 63.08, -0.25 47.19, 0 25.42 M0 25.42 C-1.79 7.39, 7.87 -1.71, 25.42 0 M0 25.42 C-1.03 9.11, 10.75 -1.12, 25.42 0" stroke="#e03131" stroke-width="1" fill="none"></path></g><g transform="translate(111.03001403808594 76.66666666666674) rotate(0 16.469985961914062 12.5)"><text x="16.469985961914062" y="17.619999999999997" font-family="Virgil, Segoe UI Emoji" font-size="20px" fill="#1971c2" text-anchor="middle" style="white-space: pre;" direction="ltr" dominant-baseline="alphabetic">pod</text></g><g stroke-linecap="round" transform="translate(458.3333333333335 10.000000000000057) rotate(0 71.66666666666663 65.83333333333334)"><path d="M21.52 20.03 C21.52 20.03, 21.52 20.03, 21.52 20.03 M21.52 20.03 C21.52 20.03, 21.52 20.03, 21.52 20.03 M4.85 45.3 C8.82 37.18, 17.13 32.07, 31.75 14.35 M4.85 45.3 C12.58 36.3, 21.48 27.83, 31.75 14.35 M3.94 52.45 C16.22 36.6, 30.94 20.26, 42.64 7.92 M3.94 52.45 C14.06 41.56, 24.22 29.57, 42.64 7.92 M3.02 59.6 C16.69 43.28, 30.45 29, 50.26 5.26 M3.02 59.6 C13.3 47.54, 22.76 36.71, 50.26 5.26 M2.1 66.75 C18.13 49.22, 31.65 28.36, 56.55 4.11 M2.1 66.75 C14.57 52.48, 27.21 38.42, 56.55 4.11 M1.18 73.9 C15.22 56.36, 29.88 42.36, 62.85 2.96 M1.18 73.9 C13.3 58.63, 26.23 45.13, 62.85 2.96 M2.89 78.04 C22 58.66, 41.25 33.21, 68.5 2.57 M2.89 78.04 C28.02 48.15, 51.12 19.67, 68.5 2.57 M4.6 82.17 C22.5 60.49, 45.13 37.39, 74.8 1.42 M4.6 82.17 C26.35 57.41, 46.93 31.74, 74.8 1.42 M6.3 86.31 C32.35 54.35, 56.95 25.54, 81.09 0.27 M6.3 86.31 C24.28 66.19, 41.83 46.22, 81.09 0.27 M8.01 90.44 C25.3 70.68, 43.01 49.07, 84.77 2.14 M8.01 90.44 C29.27 65.21, 50.57 41.95, 84.77 2.14 M9.72 94.57 C42.26 57.3, 70.87 23.01, 89.1 3.25 M9.72 94.57 C38.82 60.1, 68.92 26.32, 89.1 3.25 M10.77 99.46 C37.07 68.11, 65.52 38.09, 92.78 5.12 M10.77 99.46 C32.32 75.23, 52.53 53.32, 92.78 5.12 M13.13 102.84 C44.96 64.71, 77.04 28.58, 97.11 6.24 M13.13 102.84 C31.14 82, 50.28 60.78, 97.11 6.24 M16.15 105.46 C46.74 71.61, 76.34 37.32, 100.78 8.11 M16.15 105.46 C43.68 74.92, 70.15 45.75, 100.78 8.11 M19.17 108.09 C52.11 69.33, 87.31 28.54, 105.11 9.22 M19.17 108.09 C41.87 80.25, 66.89 54.44, 105.11 9.22 M22.19 110.71 C49.54 79.4, 78.67 43.55, 109.44 10.34 M22.19 110.71 C49.68 78.7, 78.77 47.17, 109.44 10.34 M25.21 113.34 C61.12 73.81, 94.26 33.21, 112.46 12.96 M25.21 113.34 C50.41 83.58, 76.72 53.15, 112.46 12.96 M28.23 115.96 C48.56 92.51, 67.51 72.73, 115.48 15.59 M28.23 115.96 C52.48 87.05, 75.89 59.53, 115.48 15.59 M31.24 118.59 C52.83 90.87, 77.1 65.31, 118.5 18.21 M31.24 118.59 C56.28 88.7, 81.34 58.23, 118.5 18.21 M34.26 121.21 C50.84 101.85, 70.49 79.23, 121.52 20.83 M34.26 121.21 C63.81 86.53, 95.39 51.64, 121.52 20.83 M37.94 123.08 C63.69 91.85, 92.12 58.27, 124.54 23.46 M37.94 123.08 C68.35 86.99, 98.27 52.12, 124.54 23.46 M42.27 124.19 C64.26 95.06, 90.29 70.85, 127.56 26.08 M42.27 124.19 C66.5 96.85, 89.51 70.2, 127.56 26.08 M45.94 126.06 C63.77 105.33, 81.2 84.06, 131.23 27.95 M45.94 126.06 C79.95 88.07, 112.09 50.89, 131.23 27.95 M50.27 127.18 C81.18 91.38, 112.05 57.1, 133.59 31.33 M50.27 127.18 C78.17 95.06, 105.92 63.17, 133.59 31.33 M53.95 129.05 C77.84 102.42, 97.97 75.24, 135.3 35.46 M53.95 129.05 C86.04 90.72, 118.47 55.55, 135.3 35.46 M58.28 130.16 C76.69 107.54, 95.63 83.64, 136.35 40.35 M58.28 130.16 C87.39 96.15, 116.35 63.28, 136.35 40.35 M61.96 132.03 C88.07 101.96, 112.24 71.87, 138.06 44.49 M61.96 132.03 C80.61 110.73, 97.97 91.67, 138.06 44.49 M67.6 131.64 C83.74 109.71, 103 89.79, 139.11 49.37 M67.6 131.64 C80.74 113.95, 96.88 97.62, 139.11 49.37 M73.9 130.49 C91.62 108.7, 111.36 88.05, 140.82 53.51 M73.9 130.49 C86.13 114.5, 99.67 100.12, 140.82 53.51 M80.2 129.34 C99.09 109.07, 114.01 87.19, 142.52 57.64 M80.2 129.34 C103.38 101.18, 126.67 73.55, 142.52 57.64 M85.84 128.94 C101.96 106.45, 122.86 85.81, 141.6 64.79 M85.84 128.94 C102 110.62, 117.62 92.27, 141.6 64.79 M92.14 127.8 C104.72 111.24, 120.56 94.98, 140.69 71.95 M92.14 127.8 C103.83 115.43, 115.22 101.35, 140.69 71.95 M100.41 124.38 C114.97 105.81, 130.61 91.59, 140.43 78.34 M100.41 124.38 C112.72 110.52, 124.32 96.11, 140.43 78.34 M109.99 119.46 C122 105.83, 134.38 94.27, 139.51 85.5 M109.99 119.46 C117.89 110.84, 125.75 102.01, 139.51 85.5 M119.57 114.54 C124.5 110.51, 128.35 104.45, 131.37 100.95 M119.57 114.54 C123.93 109.4, 128.31 104.46, 131.37 100.95" stroke="#ffc9c9" stroke-width="0.5" fill="none"></path><path d="M80.54 0.43 C90.23 0.41, 100.58 5.7, 109.31 10.61 C118.04 15.52, 127.47 22.03, 132.9 29.88 C138.34 37.73, 140.93 48.04, 141.93 57.71 C142.93 67.37, 142.08 78.76, 138.87 87.85 C135.67 96.94, 130.03 105.73, 122.69 112.25 C115.36 118.77, 104.82 123.69, 94.86 126.98 C84.9 130.28, 73.13 133.08, 62.91 132.05 C52.7 131.01, 42.1 125.99, 33.55 120.78 C25 115.58, 17.02 108.87, 11.6 100.84 C6.18 92.8, 2.25 81.86, 1.01 72.57 C-0.23 63.27, 0.73 53.85, 4.17 45.07 C7.6 36.29, 14.24 26.62, 21.64 19.89 C29.04 13.16, 36.73 7.4, 48.55 4.69 C60.37 1.98, 83.31 2.79, 92.56 3.63 C101.81 4.47, 104.22 8.78, 104.06 9.73 M44.35 3.52 C53.18 -0.58, 64.95 -0.16, 75.61 0.55 C86.28 1.26, 99.25 3.05, 108.35 7.76 C117.44 12.46, 124.48 20.98, 130.19 28.78 C135.89 36.59, 141.13 45.14, 142.59 54.62 C144.06 64.09, 142.01 76.57, 138.97 85.62 C135.94 94.67, 131.1 102.05, 124.38 108.91 C117.66 115.76, 108.39 123.09, 98.66 126.75 C88.94 130.41, 76.59 131.26, 66.03 130.87 C55.47 130.47, 43.99 128.81, 35.29 124.36 C26.58 119.92, 19.43 112.23, 13.8 104.19 C8.17 96.15, 3.27 85.44, 1.51 76.11 C-0.25 66.78, 0.59 57.37, 3.24 48.19 C5.89 39.01, 10.73 28.24, 17.43 21.03 C24.13 13.81, 38.61 7.25, 43.44 4.88 C48.28 2.51, 46.02 6.08, 46.46 6.83" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(496.18404514289386 63.28213690521903) rotate(0 33.63996887207031 12.5)"><text x="33.63996887207031" y="17.619999999999997" font-family="Virgil, Segoe UI Emoji" font-size="20px" fill="#1971c2" text-anchor="middle" style="white-space: pre;" direction="ltr" dominant-baseline="alphabetic">service</text></g><g stroke-linecap="round" transform="translate(478.33333333333337 265.0000000000001) rotate(0 46.666666666666686 49.166666666666686)"><path d="M8.06 41.46 C8.06 41.46, 8.06 41.46, 8.06 41.46 M8.06 41.46 C8.06 41.46, 8.06 41.46, 8.06 41.46 M4.52 51.63 C16.69 37.45, 31.25 21.62, 45.85 4.08 M4.52 51.63 C15.87 39.77, 26.35 26.93, 45.85 4.08 M6.23 55.76 C15.26 42.79, 28.89 29.41, 50.84 4.44 M6.23 55.76 C19.77 39.59, 33.09 24.31, 50.84 4.44 M8.59 59.14 C19.67 44.46, 30.74 31.92, 53.2 7.82 M8.59 59.14 C22.87 44.95, 36.25 28.92, 53.2 7.82 M11.61 61.77 C22.27 50.17, 33.74 33.89, 56.22 10.45 M11.61 61.77 C26.53 45.06, 40.66 27.72, 56.22 10.45 M14.63 64.39 C24.43 52.34, 34.66 39.56, 59.24 13.07 M14.63 64.39 C22.59 54.35, 32.75 42.82, 59.24 13.07 M16.99 67.77 C26.98 56.37, 40.41 41.21, 62.26 15.69 M16.99 67.77 C32.46 50.29, 48.25 30.33, 62.26 15.69 M20.01 70.39 C35.95 55.56, 47.54 36.49, 64.62 19.07 M20.01 70.39 C38.3 50.99, 54.66 30.62, 64.62 19.07 M23.03 73.02 C38.88 55.85, 49.86 39.29, 67.64 21.7 M23.03 73.02 C32.66 61.11, 43.75 49.47, 67.64 21.7 M25.39 76.4 C36.69 65.31, 45.13 52.06, 70 25.08 M25.39 76.4 C36.93 63.53, 45.48 51.77, 70 25.08 M28.41 79.02 C44.72 61.36, 60.5 43.53, 73.02 27.7 M28.41 79.02 C42.38 63.79, 55.48 47.1, 73.02 27.7 M31.43 81.65 C44.64 65.91, 57.96 53.13, 75.38 31.08 M31.43 81.65 C44.62 67.03, 57.85 50.25, 75.38 31.08 M34.45 84.27 C48.79 67.22, 64.55 49.75, 78.4 33.7 M34.45 84.27 C45.52 71.31, 56.68 58.55, 78.4 33.7 M36.81 87.65 C53.67 67.07, 70.8 49.09, 80.77 37.08 M36.81 87.65 C53.32 69.23, 69.68 50.62, 80.77 37.08 M39.83 90.27 C54.82 73.9, 66.73 59, 83.78 39.71 M39.83 90.27 C56.61 72.19, 73.66 53.51, 83.78 39.71 M42.85 92.9 C57.81 76.94, 72.87 59.21, 86.8 42.33 M42.85 92.9 C58.89 73.98, 75.81 53.33, 86.8 42.33 M46.52 94.77 C61.26 79.42, 74.09 61.39, 88.51 46.47 M46.52 94.77 C60.78 80.81, 73.89 65.9, 88.51 46.47 M52.82 93.62 C67.86 79.07, 81.58 61.3, 90.87 49.84 M52.82 93.62 C65.38 81.03, 76.17 66.11, 90.87 49.84" stroke="#a5d8ff" stroke-width="0.5" fill="none"></path><path d="M58.75 12.5 C68.16 22.84, 78.65 30.55, 81.58 37.5 M58.75 12.5 C64.75 18.63, 72.37 26.98, 81.58 37.5 M81.58 37.5 C93.81 49.17, 94.73 48.67, 81.58 62.5 M81.58 37.5 C95.41 49.47, 91.58 50.44, 81.58 62.5 M81.58 62.5 C75 71.25, 69.12 78.46, 58.75 85.83 M81.58 62.5 C73.38 71.26, 64.75 79.86, 58.75 85.83 M58.75 85.83 C47.5 99.77, 45.93 99.86, 35.25 85.83 M58.75 85.83 C46.54 98.86, 45.13 97.35, 35.25 85.83 M35.25 85.83 C29.82 79.91, 22.62 73.37, 11.75 62.5 M35.25 85.83 C26.01 76.78, 17.73 69.63, 11.75 62.5 M11.75 62.5 C0.02 49.85, -1.63 51.45, 11.75 37.5 M11.75 62.5 C-1.27 49.95, 2.28 49.11, 11.75 37.5 M11.75 37.5 C17.16 28.36, 27.2 21.71, 35.25 12.5 M11.75 37.5 C17.03 32.73, 22.27 26.45, 35.25 12.5 M35.25 12.5 C45.76 0.86, 47.35 1.91, 58.75 12.5 M35.25 12.5 C47.44 1.63, 48.29 -1.36, 58.75 12.5" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g stroke-linecap="round"><g transform="translate(277 80.79059573106855) rotate(0 87.24037774453862 -0.9774152976530672)"><path d="M0.58 -0.07 C29.35 -0.18, 144.45 -1.65, 173.6 -1.85 M-0.57 -1.15 C28.49 -0.95, 146.55 0.09, 175.85 -0.26" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(277 80.79059573106855) rotate(0 87.24037774453862 -0.9774152976530672)"><path d="M152.36 8.29 C161.28 3.45, 170.51 3.28, 175.85 -0.26 M152.36 8.29 C159.95 4.59, 169.46 3, 175.85 -0.26" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(277 80.79059573106855) rotate(0 87.24037774453862 -0.9774152976530672)"><path d="M152.36 -8.81 C161.11 -7.14, 170.34 -0.79, 175.85 -0.26 M152.36 -8.81 C159.95 -6.4, 169.46 -1.88, 175.85 -0.26" stroke="#1971c2" stroke-width="1" fill="none"></path></g></g><mask></mask><g stroke-linecap="round"><g transform="translate(526.6666666666667 143.33333333333348) rotate(0 0 60.985015376252534)"><path d="M-1.07 1.17 C-1.23 21.31, -0.4 101.82, -0.36 122 M0.57 0.73 C0.16 21.6, -1.67 103.06, -1.5 123.55" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(526.6666666666667 143.33333333333348) rotate(0 0 60.985015376252534)"><path d="M-9.83 99.98 C-4.74 107.74, -3.7 115.2, -1.5 123.55 M-9.83 99.98 C-6.4 106.94, -4.39 114.84, -1.5 123.55" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(526.6666666666667 143.33333333333348) rotate(0 0 60.985015376252534)"><path d="M7.27 100.14 C6.34 107.69, 1.37 115.1, -1.5 123.55 M7.27 100.14 C5.16 106.95, 1.64 114.8, -1.5 123.55" stroke="#1971c2" stroke-width="1" fill="none"></path></g></g><mask></mask></svg>
- name: another.svg
  content: >-
    <svg version="1.1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 613.3333333333335 373.3333333333335" width="613.3333333333335" height="373.3333333333335">
      <!-- svg-source:excalidraw -->

      <defs>
        <style class="style-fonts">
          @font-face {
            font-family: Virgil;
            src: url(data:font/woff2;base64,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);
              }
        </style>

      </defs>
      <g stroke-linecap="round" transform="translate(10 38.33333333333337) rotate(0 117.5 50.833333333333314)"><path d="M3.67 9.82 C3.67 9.82, 3.67 9.82, 3.67 9.82 M3.67 9.82 C3.67 9.82, 3.67 9.82, 3.67 9.82 M0.79 19.23 C6.1 14.97, 9.15 7.01, 15.22 2.63 M0.79 19.23 C4.34 14.7, 5.84 11.94, 15.22 2.63 M0.52 25.63 C9.75 18.08, 16.21 8.85, 21.52 1.48 M0.52 25.63 C4.39 21.15, 9.49 14.68, 21.52 1.48 M0.26 32.03 C4.38 23.76, 12.82 18.49, 27.82 0.33 M0.26 32.03 C8.18 22.81, 17.28 14.12, 27.82 0.33 M0.66 37.67 C10.84 24.24, 23.43 10.35, 33.46 -0.06 M0.66 37.67 C9.21 28.5, 17.84 18.26, 33.46 -0.06 M0.4 44.07 C11.4 30.74, 22.49 19.53, 38.45 0.3 M0.4 44.07 C8.71 34.19, 16.3 25.51, 38.45 0.3 M0.79 49.71 C13.67 35.94, 23.95 18.81, 44.09 -0.1 M0.79 49.71 C10.8 38.36, 20.93 27.19, 44.09 -0.1 M0.53 56.11 C11.51 42.07, 23.12 31.57, 49.08 0.26 M0.53 56.11 C9.89 44.06, 20.13 33.66, 49.08 0.26 M0.27 62.51 C16.05 46.76, 32.09 25.01, 54.72 -0.13 M0.27 62.51 C21.26 37.53, 40.13 13.91, 54.72 -0.13 M0.66 68.15 C15.43 49.92, 35.06 30.28, 59.71 0.23 M0.66 68.15 C19.12 47.38, 36.29 25.62, 59.71 0.23 M0.4 74.55 C23.03 46.7, 44.12 21.93, 65.35 -0.17 M0.4 74.55 C16.04 57, 31.28 39.68, 65.35 -0.17 M0.8 80.19 C16.42 62.34, 32.5 42.63, 70.34 0.19 M0.8 80.19 C20.12 57.32, 39.43 36.35, 70.34 0.19 M1.85 85.08 C32.27 50.15, 58.83 18.23, 75.98 -0.2 M1.85 85.08 C29.02 52.84, 57.19 21.29, 75.98 -0.2 M2.9 89.97 C27.9 60.05, 55.1 31.48, 80.97 0.16 M2.9 89.97 C23.43 66.87, 42.66 46.08, 80.97 0.16 M5.26 93.35 C36.11 56.36, 67.2 21.36, 86.61 -0.24 M5.26 93.35 C22.69 73.16, 41.26 52.6, 86.61 -0.24 M7.62 96.73 C37.97 63.13, 67.34 29.11, 91.6 0.12 M7.62 96.73 C34.94 66.41, 61.21 37.48, 91.6 0.12 M11.3 98.6 C44.24 59.84, 79.44 19.05, 97.24 -0.27 M11.3 98.6 C34 70.75, 59.01 44.95, 97.24 -0.27 M14.97 100.47 C42.32 69.15, 71.45 33.3, 102.23 0.09 M14.97 100.47 C42.46 68.46, 71.56 36.92, 102.23 0.09 M19.3 101.58 C55.73 61.45, 89.39 20.25, 107.87 -0.31 M19.3 101.58 C44.89 71.37, 71.6 40.49, 107.87 -0.31 M24.29 101.94 C44.92 78.16, 64.15 58.05, 112.86 0.06 M24.29 101.94 C48.91 72.6, 72.68 44.67, 112.86 0.06 M29.93 101.55 C51.84 73.44, 76.45 47.49, 118.5 -0.34 M29.93 101.55 C55.35 71.22, 80.79 40.29, 118.5 -0.34 M34.92 101.91 C51.78 82.23, 71.7 59.29, 123.49 0.02 M34.92 101.91 C64.92 66.7, 96.96 31.27, 123.49 0.02 M40.56 101.51 C66.72 69.79, 95.57 35.73, 128.48 0.38 M40.56 101.51 C71.43 64.89, 101.81 29.49, 128.48 0.38 M45.55 101.87 C68.45 71.68, 95.4 46.41, 134.12 -0.01 M45.55 101.87 C70.7 73.46, 94.62 45.77, 134.12 -0.01 M50.54 102.23 C69.05 80.66, 87.19 58.57, 139.11 0.35 M50.54 102.23 C85.83 62.8, 119.23 24.17, 139.11 0.35 M56.18 101.84 C89.06 63.78, 121.91 27.23, 144.75 -0.05 M56.18 101.84 C85.82 67.74, 115.33 33.82, 144.75 -0.05 M61.17 102.2 C87.02 73.16, 109.18 43.64, 149.74 0.31 M61.17 102.2 C96.12 60.55, 131.38 22.12, 149.74 0.31 M66.81 101.8 C87.8 76.14, 109.36 49.23, 155.38 -0.08 M66.81 101.8 C99.91 63.25, 132.81 25.85, 155.38 -0.08 M71.8 102.16 C102.19 67.23, 130.51 32.37, 160.37 0.28 M71.8 102.16 C93.4 77.52, 113.62 55.17, 160.37 0.28 M77.44 101.77 C97.8 74.98, 121.18 50.32, 166.01 -0.12 M77.44 101.77 C93.91 80.02, 113.49 59.72, 166.01 -0.12 M82.43 102.13 C106.06 73.22, 131.9 45.57, 171 0.24 M82.43 102.13 C98.82 81.21, 116.77 61.76, 171 0.24 M88.07 101.73 C114.46 73, 136.78 42.62, 176.64 -0.15 M88.07 101.73 C121.11 61.98, 154.41 22.85, 176.64 -0.15 M93.06 102.09 C119.63 67.53, 151.31 34.48, 181.63 0.21 M93.06 102.09 C118.48 73, 143.45 43.89, 181.63 0.21 M98.7 101.7 C123.01 71.35, 150.56 41.61, 187.27 -0.19 M98.7 101.7 C119.88 78.55, 140.8 53.52, 187.27 -0.19 M103.69 102.06 C136.04 62.63, 169.43 27.99, 192.26 0.17 M103.69 102.06 C130.9 71.12, 157.25 39.74, 192.26 0.17 M109.33 101.66 C144.11 61.82, 179.3 24.03, 197.9 -0.22 M109.33 101.66 C132.24 76.09, 155.23 49.84, 197.9 -0.22 M114.32 102.02 C147.97 64.56, 180.54 25.27, 202.89 0.14 M114.32 102.02 C144.58 66.53, 175.72 30.81, 202.89 0.14 M119.96 101.63 C144.8 75.62, 167.81 45.74, 208.53 -0.26 M119.96 101.63 C144.52 73.29, 170.86 44.54, 208.53 -0.26 M124.95 101.99 C143.95 77.46, 166.92 56.93, 212.86 0.86 M124.95 101.99 C156.44 64.21, 189.1 26.2, 212.86 0.86 M130.59 101.6 C150.7 80.45, 169.56 57.24, 217.85 1.22 M130.59 101.6 C157.72 69.47, 184.19 38.17, 217.85 1.22 M135.58 101.96 C159.53 71.12, 187.33 43.21, 222.18 2.33 M135.58 101.96 C167.77 65.09, 200.55 27.67, 222.18 2.33 M141.22 101.56 C171.07 68.74, 196.72 37.55, 225.2 4.96 M141.22 101.56 C166.49 71.31, 192.99 41.6, 225.2 4.96 M146.21 101.92 C165.12 79.12, 182.71 58.28, 228.87 6.83 M146.21 101.92 C164.64 81.6, 182.68 61.55, 228.87 6.83 M151.85 101.53 C173.41 76.26, 199.2 46.69, 231.23 10.21 M151.85 101.53 C168.28 83.49, 184.64 65.2, 231.23 10.21 M156.84 101.89 C186.12 69.23, 210.27 40.29, 233.6 13.59 M156.84 101.89 C175.64 81.86, 193.22 59.4, 233.6 13.59 M161.83 102.25 C188.31 72.54, 213.44 43.58, 234.65 18.47 M161.83 102.25 C180.86 79.36, 201.97 56.62, 234.65 18.47 M167.47 101.85 C188.74 77.89, 211.38 49.54, 235.04 24.12 M167.47 101.85 C182.31 83.97, 197.6 66.91, 235.04 24.12 M172.46 102.21 C197.06 77.09, 218.56 50.25, 234.78 30.52 M172.46 102.21 C195.8 77.4, 217.47 52.4, 234.78 30.52 M178.1 101.82 C195.45 82.86, 207.69 65.29, 235.18 36.16 M178.1 101.82 C189.4 87.73, 201.91 72.7, 235.18 36.16 M183.09 102.18 C203.46 78.98, 223.41 56.48, 234.91 42.56 M183.09 102.18 C195.25 87.43, 207.98 73.93, 234.91 42.56 M188.73 101.78 C199.23 89.37, 207.56 79.57, 235.31 48.2 M188.73 101.78 C203.49 85.08, 217.86 67.53, 235.31 48.2 M193.72 102.14 C202.83 91.76, 214.63 80.03, 235.05 54.6 M193.72 102.14 C206.65 88.29, 219.35 73.25, 235.05 54.6 M199.36 101.75 C205.58 91.17, 215.95 80.48, 235.44 60.24 M199.36 101.75 C209.59 90.64, 219.67 77.39, 235.44 60.24 M204.35 102.11 C214.66 89.58, 226.06 76.46, 235.18 66.64 M204.35 102.11 C211.91 92.09, 220.06 82.78, 235.18 66.64 M209.99 101.71 C219 93.2, 227.56 81.75, 235.57 72.28 M209.99 101.71 C219.57 91.74, 229.07 81.05, 235.57 72.28 M216.29 100.57 C222.23 91.8, 230.45 84.68, 235.31 78.68 M216.29 100.57 C223.37 92.96, 230.74 83.83, 235.31 78.68 M223.24 98.66 C224.8 94.69, 229.89 91.73, 234.4 85.83 M223.24 98.66 C225.24 96.09, 228.26 93.69, 234.4 85.83" stroke="#ffc9c9" stroke-width="0.5" fill="none"></path><path d="M25.42 0 C95.63 1.3, 162.73 1.75, 209.58 0 M25.42 0 C84.47 0.08, 144.21 0.79, 209.58 0 M209.58 0 C225.71 0.8, 234.76 6.95, 235 25.42 M209.58 0 C226.87 0.01, 234.71 8.15, 235 25.42 M235 25.42 C233.62 35.23, 233.45 45.83, 235 76.25 M235 25.42 C234.1 36.84, 235.31 50.39, 235 76.25 M235 76.25 C236.92 93.41, 225.62 103.3, 209.58 101.67 M235 76.25 C236.88 94.92, 227.04 103.7, 209.58 101.67 M209.58 101.67 C138.69 102.85, 70.63 100.01, 25.42 101.67 M209.58 101.67 C172.03 101.08, 133.69 100.23, 25.42 101.67 M25.42 101.67 C6.56 100.01, 1.57 93.05, 0 76.25 M25.42 101.67 C6.54 102.96, -0.23 94.46, 0 76.25 M0 76.25 C1.35 65.77, 1.2 55.06, 0 25.42 M0 76.25 C0.55 63.08, -0.25 47.19, 0 25.42 M0 25.42 C-1.79 7.39, 7.87 -1.71, 25.42 0 M0 25.42 C-1.03 9.11, 10.75 -1.12, 25.42 0" stroke="#e03131" stroke-width="1" fill="none"></path></g><g transform="translate(111.03001403808594 76.66666666666674) rotate(0 16.469985961914062 12.5)"><text x="16.469985961914062" y="17.619999999999997" font-family="Virgil, Segoe UI Emoji" font-size="20px" fill="#1971c2" text-anchor="middle" style="white-space: pre;" direction="ltr" dominant-baseline="alphabetic">pod</text></g><g stroke-linecap="round" transform="translate(460.0000000000002 10) rotate(0 71.66666666666663 65.83333333333331)"><path d="M21.52 20.03 C21.52 20.03, 21.52 20.03, 21.52 20.03 M21.52 20.03 C21.52 20.03, 21.52 20.03, 21.52 20.03 M4.85 45.3 C8.82 37.18, 17.13 32.07, 31.75 14.35 M4.85 45.3 C12.58 36.3, 21.48 27.83, 31.75 14.35 M3.94 52.45 C16.22 36.6, 30.94 20.26, 42.64 7.92 M3.94 52.45 C14.06 41.56, 24.22 29.57, 42.64 7.92 M3.02 59.6 C16.69 43.28, 30.45 29, 50.26 5.26 M3.02 59.6 C13.3 47.54, 22.76 36.71, 50.26 5.26 M2.1 66.75 C18.13 49.22, 31.65 28.36, 56.55 4.11 M2.1 66.75 C14.57 52.48, 27.21 38.42, 56.55 4.11 M1.18 73.9 C15.22 56.36, 29.88 42.36, 62.85 2.96 M1.18 73.9 C13.3 58.63, 26.23 45.13, 62.85 2.96 M2.89 78.04 C22 58.66, 41.25 33.21, 68.5 2.57 M2.89 78.04 C28.02 48.15, 51.12 19.67, 68.5 2.57 M4.6 82.17 C22.5 60.49, 45.13 37.39, 74.8 1.42 M4.6 82.17 C26.35 57.41, 46.93 31.74, 74.8 1.42 M6.3 86.31 C32.35 54.35, 56.95 25.54, 81.09 0.27 M6.3 86.31 C24.28 66.19, 41.83 46.22, 81.09 0.27 M8.01 90.44 C25.3 70.68, 43.01 49.07, 84.77 2.14 M8.01 90.44 C29.27 65.21, 50.57 41.95, 84.77 2.14 M9.72 94.57 C42.26 57.3, 70.87 23.01, 89.1 3.25 M9.72 94.57 C38.82 60.1, 68.92 26.32, 89.1 3.25 M10.77 99.46 C37.07 68.11, 65.52 38.09, 92.78 5.12 M10.77 99.46 C32.32 75.23, 52.53 53.32, 92.78 5.12 M13.13 102.84 C44.96 64.71, 77.04 28.58, 97.11 6.24 M13.13 102.84 C31.14 82, 50.28 60.78, 97.11 6.24 M16.15 105.46 C46.74 71.61, 76.34 37.32, 100.78 8.11 M16.15 105.46 C43.68 74.92, 70.15 45.75, 100.78 8.11 M19.17 108.09 C52.11 69.33, 87.31 28.54, 105.11 9.22 M19.17 108.09 C41.87 80.25, 66.89 54.44, 105.11 9.22 M22.19 110.71 C49.54 79.4, 78.67 43.55, 109.44 10.34 M22.19 110.71 C49.68 78.7, 78.77 47.17, 109.44 10.34 M25.21 113.34 C61.12 73.81, 94.26 33.21, 112.46 12.96 M25.21 113.34 C50.41 83.58, 76.72 53.15, 112.46 12.96 M28.23 115.96 C48.56 92.51, 67.51 72.73, 115.48 15.59 M28.23 115.96 C52.48 87.05, 75.89 59.53, 115.48 15.59 M31.24 118.59 C52.83 90.87, 77.1 65.31, 118.5 18.21 M31.24 118.59 C56.28 88.7, 81.34 58.23, 118.5 18.21 M34.26 121.21 C50.84 101.85, 70.49 79.23, 121.52 20.83 M34.26 121.21 C63.81 86.53, 95.39 51.64, 121.52 20.83 M37.94 123.08 C63.69 91.85, 92.12 58.27, 124.54 23.46 M37.94 123.08 C68.35 86.99, 98.27 52.12, 124.54 23.46 M42.27 124.19 C64.26 95.06, 90.29 70.85, 127.56 26.08 M42.27 124.19 C66.5 96.85, 89.51 70.2, 127.56 26.08 M45.94 126.06 C63.77 105.33, 81.2 84.06, 131.23 27.95 M45.94 126.06 C79.95 88.07, 112.09 50.89, 131.23 27.95 M50.27 127.18 C81.18 91.38, 112.05 57.1, 133.59 31.33 M50.27 127.18 C78.17 95.06, 105.92 63.17, 133.59 31.33 M53.95 129.05 C77.84 102.42, 97.97 75.24, 135.3 35.46 M53.95 129.05 C86.04 90.72, 118.47 55.55, 135.3 35.46 M58.28 130.16 C76.69 107.54, 95.63 83.64, 136.35 40.35 M58.28 130.16 C87.39 96.15, 116.35 63.28, 136.35 40.35 M61.96 132.03 C88.07 101.96, 112.24 71.87, 138.06 44.49 M61.96 132.03 C80.61 110.73, 97.97 91.67, 138.06 44.49 M67.6 131.64 C83.74 109.71, 103 89.79, 139.11 49.37 M67.6 131.64 C80.74 113.95, 96.88 97.62, 139.11 49.37 M73.9 130.49 C91.62 108.7, 111.36 88.05, 140.82 53.51 M73.9 130.49 C86.13 114.5, 99.67 100.12, 140.82 53.51 M80.2 129.34 C99.09 109.07, 114.01 87.19, 142.52 57.64 M80.2 129.34 C103.38 101.18, 126.67 73.55, 142.52 57.64 M85.84 128.94 C101.96 106.45, 122.86 85.81, 141.6 64.79 M85.84 128.94 C102 110.62, 117.62 92.27, 141.6 64.79 M92.14 127.8 C104.72 111.24, 120.56 94.98, 140.69 71.95 M92.14 127.8 C103.83 115.43, 115.22 101.35, 140.69 71.95 M100.41 124.38 C114.97 105.81, 130.61 91.59, 140.43 78.34 M100.41 124.38 C112.72 110.52, 124.32 96.11, 140.43 78.34 M109.99 119.46 C122 105.83, 134.38 94.27, 139.51 85.5 M109.99 119.46 C117.89 110.84, 125.75 102.01, 139.51 85.5 M119.57 114.54 C124.5 110.51, 128.35 104.45, 131.37 100.95 M119.57 114.54 C123.93 109.4, 128.31 104.46, 131.37 100.95" stroke="#ffc9c9" stroke-width="0.5" fill="none"></path><path d="M80.54 0.43 C90.23 0.41, 100.58 5.7, 109.31 10.61 C118.04 15.52, 127.47 22.03, 132.9 29.88 C138.34 37.73, 140.93 48.04, 141.93 57.71 C142.93 67.37, 142.08 78.76, 138.87 87.85 C135.67 96.94, 130.03 105.73, 122.69 112.25 C115.36 118.77, 104.82 123.69, 94.86 126.98 C84.9 130.28, 73.13 133.08, 62.91 132.05 C52.7 131.01, 42.1 125.99, 33.55 120.78 C25 115.58, 17.02 108.87, 11.6 100.84 C6.18 92.8, 2.25 81.86, 1.01 72.57 C-0.23 63.27, 0.73 53.85, 4.17 45.07 C7.6 36.29, 14.24 26.62, 21.64 19.89 C29.04 13.16, 36.73 7.4, 48.55 4.69 C60.37 1.98, 83.31 2.79, 92.56 3.63 C101.81 4.47, 104.22 8.78, 104.06 9.73 M44.35 3.52 C53.18 -0.58, 64.95 -0.16, 75.61 0.55 C86.28 1.26, 99.25 3.05, 108.35 7.76 C117.44 12.46, 124.48 20.98, 130.19 28.78 C135.89 36.59, 141.13 45.14, 142.59 54.62 C144.06 64.09, 142.01 76.57, 138.97 85.62 C135.94 94.67, 131.1 102.05, 124.38 108.91 C117.66 115.76, 108.39 123.09, 98.66 126.75 C88.94 130.41, 76.59 131.26, 66.03 130.87 C55.47 130.47, 43.99 128.81, 35.29 124.36 C26.58 119.92, 19.43 112.23, 13.8 104.19 C8.17 96.15, 3.27 85.44, 1.51 76.11 C-0.25 66.78, 0.59 57.37, 3.24 48.19 C5.89 39.01, 10.73 28.24, 17.43 21.03 C24.13 13.81, 38.61 7.25, 43.44 4.88 C48.28 2.51, 46.02 6.08, 46.46 6.83" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(497.8507118095607 63.28213690521898) rotate(0 33.63996887207031 12.5)"><text x="33.63996887207031" y="17.619999999999997" font-family="Virgil, Segoe UI Emoji" font-size="20px" fill="#1971c2" text-anchor="middle" style="white-space: pre;" direction="ltr" dominant-baseline="alphabetic">service</text></g><g stroke-linecap="round" transform="translate(478.33333333333337 265.0000000000001) rotate(0 46.666666666666686 49.166666666666686)"><path d="M8.06 41.46 C8.06 41.46, 8.06 41.46, 8.06 41.46 M8.06 41.46 C8.06 41.46, 8.06 41.46, 8.06 41.46 M4.52 51.63 C16.69 37.45, 31.25 21.62, 45.85 4.08 M4.52 51.63 C15.87 39.77, 26.35 26.93, 45.85 4.08 M6.23 55.76 C15.26 42.79, 28.89 29.41, 50.84 4.44 M6.23 55.76 C19.77 39.59, 33.09 24.31, 50.84 4.44 M8.59 59.14 C19.67 44.46, 30.74 31.92, 53.2 7.82 M8.59 59.14 C22.87 44.95, 36.25 28.92, 53.2 7.82 M11.61 61.77 C22.27 50.17, 33.74 33.89, 56.22 10.45 M11.61 61.77 C26.53 45.06, 40.66 27.72, 56.22 10.45 M14.63 64.39 C24.43 52.34, 34.66 39.56, 59.24 13.07 M14.63 64.39 C22.59 54.35, 32.75 42.82, 59.24 13.07 M16.99 67.77 C26.98 56.37, 40.41 41.21, 62.26 15.69 M16.99 67.77 C32.46 50.29, 48.25 30.33, 62.26 15.69 M20.01 70.39 C35.95 55.56, 47.54 36.49, 64.62 19.07 M20.01 70.39 C38.3 50.99, 54.66 30.62, 64.62 19.07 M23.03 73.02 C38.88 55.85, 49.86 39.29, 67.64 21.7 M23.03 73.02 C32.66 61.11, 43.75 49.47, 67.64 21.7 M25.39 76.4 C36.69 65.31, 45.13 52.06, 70 25.08 M25.39 76.4 C36.93 63.53, 45.48 51.77, 70 25.08 M28.41 79.02 C44.72 61.36, 60.5 43.53, 73.02 27.7 M28.41 79.02 C42.38 63.79, 55.48 47.1, 73.02 27.7 M31.43 81.65 C44.64 65.91, 57.96 53.13, 75.38 31.08 M31.43 81.65 C44.62 67.03, 57.85 50.25, 75.38 31.08 M34.45 84.27 C48.79 67.22, 64.55 49.75, 78.4 33.7 M34.45 84.27 C45.52 71.31, 56.68 58.55, 78.4 33.7 M36.81 87.65 C53.67 67.07, 70.8 49.09, 80.77 37.08 M36.81 87.65 C53.32 69.23, 69.68 50.62, 80.77 37.08 M39.83 90.27 C54.82 73.9, 66.73 59, 83.78 39.71 M39.83 90.27 C56.61 72.19, 73.66 53.51, 83.78 39.71 M42.85 92.9 C57.81 76.94, 72.87 59.21, 86.8 42.33 M42.85 92.9 C58.89 73.98, 75.81 53.33, 86.8 42.33 M46.52 94.77 C61.26 79.42, 74.09 61.39, 88.51 46.47 M46.52 94.77 C60.78 80.81, 73.89 65.9, 88.51 46.47 M52.82 93.62 C67.86 79.07, 81.58 61.3, 90.87 49.84 M52.82 93.62 C65.38 81.03, 76.17 66.11, 90.87 49.84" stroke="#a5d8ff" stroke-width="0.5" fill="none"></path><path d="M58.75 12.5 C68.16 22.84, 78.65 30.55, 81.58 37.5 M58.75 12.5 C64.75 18.63, 72.37 26.98, 81.58 37.5 M81.58 37.5 C93.81 49.17, 94.73 48.67, 81.58 62.5 M81.58 37.5 C95.41 49.47, 91.58 50.44, 81.58 62.5 M81.58 62.5 C75 71.25, 69.12 78.46, 58.75 85.83 M81.58 62.5 C73.38 71.26, 64.75 79.86, 58.75 85.83 M58.75 85.83 C47.5 99.77, 45.93 99.86, 35.25 85.83 M58.75 85.83 C46.54 98.86, 45.13 97.35, 35.25 85.83 M35.25 85.83 C29.82 79.91, 22.62 73.37, 11.75 62.5 M35.25 85.83 C26.01 76.78, 17.73 69.63, 11.75 62.5 M11.75 62.5 C0.02 49.85, -1.63 51.45, 11.75 37.5 M11.75 62.5 C-1.27 49.95, 2.28 49.11, 11.75 37.5 M11.75 37.5 C17.16 28.36, 27.2 21.71, 35.25 12.5 M11.75 37.5 C17.03 32.73, 22.27 26.45, 35.25 12.5 M35.25 12.5 C45.76 0.86, 47.35 1.91, 58.75 12.5 M35.25 12.5 C47.44 1.63, 48.29 -1.36, 58.75 12.5" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g stroke-linecap="round"><g transform="translate(277 80.7905957310686) rotate(0 88.07360352684105 -0.9802934328467927)"><path d="M0.58 -0.07 C29.63 -0.18, 145.84 -1.66, 175.27 -1.86 M-0.57 -1.15 C28.76 -0.95, 147.94 0.08, 177.52 -0.27" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(277 80.7905957310686) rotate(0 88.07360352684105 -0.9802934328467927)"><path d="M154.02 8.28 C162.94 3.44, 172.17 3.27, 177.52 -0.27 M154.02 8.28 C161.61 4.59, 171.13 2.99, 177.52 -0.27" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(277 80.7905957310686) rotate(0 88.07360352684105 -0.9802934328467927)"><path d="M154.02 -8.82 C162.78 -7.14, 172.01 -0.8, 177.52 -0.27 M154.02 -8.82 C161.62 -6.4, 171.13 -1.89, 177.52 -0.27" stroke="#1971c2" stroke-width="1" fill="none"></path></g></g><mask></mask><g stroke-linecap="round"><g transform="translate(537.0268263429903 149.20764459888164) rotate(0 -0.3339312189123689 63.15362346733042)"><path d="M-1.07 1.17 C-1.34 22.03, -0.96 105.43, -1.03 126.34 M0.57 0.73 C0.05 22.32, -2.23 106.67, -2.17 127.89" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(537.0268263429903 149.20764459888164) rotate(0 -0.3339312189123689 63.15362346733042)"><path d="M-10.39 104.28 C-5.33 112.05, -4.34 119.53, -2.17 127.89 M-10.39 104.28 C-6.99 111.25, -5.02 119.17, -2.17 127.89" stroke="#1971c2" stroke-width="1" fill="none"></path></g><g transform="translate(537.0268263429903 149.20764459888164) rotate(0 -0.3339312189123689 63.15362346733042)"><path d="M6.71 104.52 C5.75 112.06, 0.73 119.45, -2.17 127.89 M6.71 104.52 C4.57 111.32, 1.01 119.16, -2.17 127.89" stroke="#1971c2" stroke-width="1" fill="none"></path></g></g><mask></mask></svg>
      ```
