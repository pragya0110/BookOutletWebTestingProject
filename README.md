


<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title></title>
<link rel="apple-touch-icon" href="https://cdn.jsdelivr.net/gh/extent-framework/extent-github-cdn@b00a2d0486596e73dd7326beacf352c639623a0e/commons/img/logo.png">
<link rel="shortcut icon" href="https://cdn.jsdelivr.net/gh/extent-framework/extent-github-cdn@b00a2d0486596e73dd7326beacf352c639623a0e/commons/img/logo.png">
<link href="https://cdn.jsdelivr.net/gh/extent-framework/extent-github-cdn@83e4e8776725a49f9e738b19d1e718e7404d6c19/spark/css/spark-style.css" rel="stylesheet" />
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<script src="https://cdn.rawgit.com/extent-framework/extent-github-cdn/7cc78ce/spark/js/jsontree.js"></script>
<style type="text/css"></style></head><body class="spa -report standard">
  <div class="app">
    <div class="layout">
<div class="header navbar">
<div class="vheader">
<div class="nav-logo">
<a href="#">
<div class="logo" style="background-image: url('https://cdn.jsdelivr.net/gh/extent-framework/extent-github-cdn@b00a2d0486596e73dd7326beacf352c639623a0e/commons/img/logo.png')"></div>
</a>
</div>
<ul class="nav-left">
<li class="search-box">
<a class="search-toggle" href="#">
<i class="search-icon fa fa-search"></i>
<i class="search-icon-close fa fa-close"></i>
</a>
</li>
<li class="search-input"><input id="search-tests" class="form-control" type="text" placeholder="Search..."></li>
</ul>
<ul class="nav-right">
<li class="m-r-10">
<a href="#"><span class="badge badge-primary"></span></a>
</li>
<li class="m-r-10">
<a href="#"><span class="badge badge-primary">May 21, 2023 12:03:06 AM</span></a>
</li>
</ul>
</div>
</div><div class="side-nav">
<div class="side-nav-inner">
<ul class="side-nav-menu">
<li class="nav-item dropdown" onclick="toggleView('test-view')">
<a id="nav-test" class="dropdown-toggle" href="#">
<span class="ico"><i class="fa fa-list"></i></span>
</a>
</li>
<li class="nav-item dropdown" onclick="toggleView('category-view')">
<a id="nav-category" class="dropdown-toggle" href="#">
<span class="ico"><i class="fa fa-tag"></i></span>
</a>
</li>
<li class="nav-item dropdown" onclick="toggleView('author-view')">
<a id="nav-author" class="dropdown-toggle" href="#">
<span class="ico"><i class="fa fa-user"></i></span>
</a>
</li>
<li class="nav-item dropdown" onclick="toggleView('dashboard-view')">
<a id="nav-dashboard" class="dropdown-toggle" href="#">
<span class="ico"><i class="fa fa-bar-chart"></i></span>
</a>
</li>
</ul>
</div>
</div>      <div class="vcontainer">
        <div class="main-content">
<div class="test-wrapper row view test-view">
  <div class="test-list">
    <div class="test-list-tools">
<ul class="tools pull-left">
<li><a href="#"><span class="font-size-14">Tests</span></a></li>
</ul>
<ul class="tools text-right">
<li class="dropdown">
<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-exclamation-circle"></i></a>
<ul id="status-toggle" class="dropdown-menu dropdown-md p-v-0">
<a class="dropdown-item" status="pass" href="#"><span>Pass</span><span class="status success"></span></a>
<div class="dropdown-divider"></div>
<a status="clear" class="dropdown-item" href="#"><span>Clear</span><span class="pull-right"><i class="fa fa-close"></i></span></a>
</ul>
</li>
<li class="dropdown">
<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i></a>
<ul id="author-toggle" class="dropdown-menu dropdown-md p-v-0">
<a class="dropdown-item" href="#">Pragya</a>
</ul>
</li>
<li class="dropdown">
<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-tag"></i></a>
<ul id="tag-toggle" class="dropdown-menu dropdown-md p-v-0">
<a class="dropdown-item" href="#">Functional</a><a class="dropdown-item" href="#">Smoke</a>
</ul>
</li>
</ul>
</div>    <div class="test-list-wrapper scrollable">
      <ul class="test-list-item">
        <li class="test-item"  status="pass" test-id="1"
          author="Pragya"
          tag="Functional"
          device="">
          <div class="status-avatar pass-bg">
            <i class="fa fa-check text-white"></i>
          </div>
          <div class="test-detail">
            <span class="meta text-white badge badge-sm"></span>
            <p class="name">Author Name Suggestion Order Test</p>
            <p class="text-sm"><span>00:03:13 AM</span> / <span>1.086 secs</span></p>
          </div>
          <div class="test-contents d-none">
<div class="detail-head">
<div class="p-v-10">
<div class="info">
<div class='float-right'><span class='badge badge-default'>#test-id=1</span></div>
<h5 class="test-status text-pass">Author Name Suggestion Order Test</h5>
<span class='badge badge-success'>05.21.2023 00:03:13</span>
<span class='badge badge-danger'>05.21.2023 00:03:15</span>
<span class='badge badge-default'>1.086 secs</span>
</div>
<div class="m-t-15"><span class="badge badge-pill badge-default"> Pragya</span>
<span class="badge badge-pill badge-default"> Functional</span></div>
</div>
</div><div class="detail-body mt-4">
<table class="table table-sm">
  <thead><tr><th class="status-col">Status</th><th class="timestamp-col">Timestamp</th><th class="details-col">Details</th></tr></thead>
  <tbody>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:13 AM</td>
        <td>
          Verify that the author names in the autosuggestion dropdown are displayed in alphabetical order.
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:13 AM</td>
        <td>
          EnteringAlicein search field
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:14 AM</td>
        <td>
          verifying whether author name in suggestion box in in alphabetical order)
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log pass-bg">Pass</span></td>
        <td>12:03:15 AM</td>
        <td>
          Passed
        </td>
      </tr>
  </tbody>
</table>
</div>
          </div>
        </li>
        <li class="test-item"  status="pass" test-id="2"
          author="Pragya"
          tag="Functional"
          device="">
          <div class="status-avatar pass-bg">
            <i class="fa fa-check text-white"></i>
          </div>
          <div class="test-detail">
            <span class="meta text-white badge badge-sm"></span>
            <p class="name">Auto Suggestion Search Test</p>
            <p class="text-sm"><span>00:03:15 AM</span> / <span>0.845 secs</span></p>
          </div>
          <div class="test-contents d-none">
<div class="detail-head">
<div class="p-v-10">
<div class="info">
<div class='float-right'><span class='badge badge-default'>#test-id=2</span></div>
<h5 class="test-status text-pass">Auto Suggestion Search Test</h5>
<span class='badge badge-success'>05.21.2023 00:03:15</span>
<span class='badge badge-danger'>05.21.2023 00:03:15</span>
<span class='badge badge-default'>0.845 secs</span>
</div>
<div class="m-t-15"><span class="badge badge-pill badge-default"> Pragya</span>
<span class="badge badge-pill badge-default"> Functional</span></div>
</div>
</div><div class="detail-body mt-4">
<table class="table table-sm">
  <thead><tr><th class="status-col">Status</th><th class="timestamp-col">Timestamp</th><th class="details-col">Details</th></tr></thead>
  <tbody>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:15 AM</td>
        <td>
          Verify that the autocomplete suggestions are displayed
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:15 AM</td>
        <td>
          Setting search query to: Strange
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:15 AM</td>
        <td>
          Verifying search suggestions are displayed
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log pass-bg">Pass</span></td>
        <td>12:03:15 AM</td>
        <td>
          Passed
        </td>
      </tr>
  </tbody>
</table>
</div>
          </div>
        </li>
        <li class="test-item"  status="pass" test-id="3"
          author="Pragya"
          tag="Functional"
          device="">
          <div class="status-avatar pass-bg">
            <i class="fa fa-check text-white"></i>
          </div>
          <div class="test-detail">
            <span class="meta text-white badge badge-sm"></span>
            <p class="name">Book Title Suggestion Order Test</p>
            <p class="text-sm"><span>00:03:15 AM</span> / <span>0.297 secs</span></p>
          </div>
          <div class="test-contents d-none">
<div class="detail-head">
<div class="p-v-10">
<div class="info">
<div class='float-right'><span class='badge badge-default'>#test-id=3</span></div>
<h5 class="test-status text-pass">Book Title Suggestion Order Test</h5>
<span class='badge badge-success'>05.21.2023 00:03:15</span>
<span class='badge badge-danger'>05.21.2023 00:03:16</span>
<span class='badge badge-default'>0.297 secs</span>
</div>
<div class="m-t-15"><span class="badge badge-pill badge-default"> Pragya</span>
<span class="badge badge-pill badge-default"> Functional</span></div>
</div>
</div><div class="detail-body mt-4">
<table class="table table-sm">
  <thead><tr><th class="status-col">Status</th><th class="timestamp-col">Timestamp</th><th class="details-col">Details</th></tr></thead>
  <tbody>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:15 AM</td>
        <td>
          Verify that the book titles in the autosuggestion dropdown are displayed in alphabetical order.
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:15 AM</td>
        <td>
          EnteringAlicein search field
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:16 AM</td>
        <td>
          verifying whether title name in suggestion box in in alphabetical order)
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log pass-bg">Pass</span></td>
        <td>12:03:16 AM</td>
        <td>
          Passed
        </td>
      </tr>
  </tbody>
</table>
</div>
          </div>
        </li>
        <li class="test-item"  status="pass" test-id="4"
          author="Pragya"
          tag="Functional"
          device="">
          <div class="status-avatar pass-bg">
            <i class="fa fa-check text-white"></i>
          </div>
          <div class="test-detail">
            <span class="meta text-white badge badge-sm"></span>
            <p class="name">Case Insensitivity Search Query</p>
            <p class="text-sm"><span>00:03:16 AM</span> / <span>15.525 secs</span></p>
          </div>
          <div class="test-contents d-none">
<div class="detail-head">
<div class="p-v-10">
<div class="info">
<div class='float-right'><span class='badge badge-default'>#test-id=4</span></div>
<h5 class="test-status text-pass">Case Insensitivity Search Query</h5>
<span class='badge badge-success'>05.21.2023 00:03:16</span>
<span class='badge badge-danger'>05.21.2023 00:03:31</span>
<span class='badge badge-default'>15.525 secs</span>
</div>
<div class="m-t-15"><span class="badge badge-pill badge-default"> Pragya</span>
<span class="badge badge-pill badge-default"> Functional</span></div>
</div>
</div><div class="detail-body mt-4">
<table class="table table-sm">
  <thead><tr><th class="status-col">Status</th><th class="timestamp-col">Timestamp</th><th class="details-col">Details</th></tr></thead>
  <tbody>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:16 AM</td>
        <td>
          Verify that the search is case-insensitive and returns results regardless of the case used in the search query.
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:16 AM</td>
        <td>
          EnteringAlIcein search field
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:21 AM</td>
        <td>
          Verify whether search suggestion are displayed irrespective of uppercase or lowercase 
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log pass-bg">Pass</span></td>
        <td>12:03:31 AM</td>
        <td>
          Passed
        </td>
      </tr>
  </tbody>
</table>
</div>
          </div>
        </li>
        <li class="test-item"  status="pass" test-id="5"
          author="Pragya"
          tag="Functional"
          device="">
          <div class="status-avatar pass-bg">
            <i class="fa fa-check text-white"></i>
          </div>
          <div class="test-detail">
            <span class="meta text-white badge badge-sm"></span>
            <p class="name">Invalid Search Query</p>
            <p class="text-sm"><span>00:03:31 AM</span> / <span>5.605 secs</span></p>
          </div>
          <div class="test-contents d-none">
<div class="detail-head">
<div class="p-v-10">
<div class="info">
<div class='float-right'><span class='badge badge-default'>#test-id=5</span></div>
<h5 class="test-status text-pass">Invalid Search Query</h5>
<span class='badge badge-success'>05.21.2023 00:03:31</span>
<span class='badge badge-danger'>05.21.2023 00:03:37</span>
<span class='badge badge-default'>5.605 secs</span>
</div>
<div class="m-t-15"><span class="badge badge-pill badge-default"> Pragya</span>
<span class="badge badge-pill badge-default"> Functional</span></div>
</div>
</div><div class="detail-body mt-4">
<table class="table table-sm">
  <thead><tr><th class="status-col">Status</th><th class="timestamp-col">Timestamp</th><th class="details-col">Details</th></tr></thead>
  <tbody>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:31 AM</td>
        <td>
          Verify that the search results page displays error message for invalid search query.
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:31 AM</td>
        <td>
          Entering###in search field
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:37 AM</td>
        <td>
          Verifying error message displayed on invalid search query
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log pass-bg">Pass</span></td>
        <td>12:03:37 AM</td>
        <td>
          Passed
        </td>
      </tr>
  </tbody>
</table>
</div>
          </div>
        </li>
        <li class="test-item"  status="pass" test-id="6"
          author="Pragya"
          tag="Functional Smoke"
          device="">
          <div class="status-avatar pass-bg">
            <i class="fa fa-check text-white"></i>
          </div>
          <div class="test-detail">
            <span class="meta text-white badge badge-sm"></span>
            <p class="name">Real Time Search SuggestionsTest</p>
            <p class="text-sm"><span>00:03:37 AM</span> / <span>31.919 secs</span></p>
          </div>
          <div class="test-contents d-none">
<div class="detail-head">
<div class="p-v-10">
<div class="info">
<div class='float-right'><span class='badge badge-default'>#test-id=6</span></div>
<h5 class="test-status text-pass">Real Time Search SuggestionsTest</h5>
<span class='badge badge-success'>05.21.2023 00:03:37</span>
<span class='badge badge-danger'>05.21.2023 00:04:09</span>
<span class='badge badge-default'>31.919 secs</span>
</div>
<div class="m-t-15"><span class="badge badge-pill badge-default"> Pragya</span>
<span class="badge badge-pill badge-default"> Functional</span>
<span class="badge badge-pill badge-default"> Smoke</span></div>
</div>
</div><div class="detail-body mt-4">
<table class="table table-sm">
  <thead><tr><th class="status-col">Status</th><th class="timestamp-col">Timestamp</th><th class="details-col">Details</th></tr></thead>
  <tbody>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:37 AM</td>
        <td>
          Verify that the search suggestions are displayed in real-time as the query is entered.
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:37 AM</td>
        <td>
          EnteringAin search field
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:37 AM</td>
        <td>
          Validating search suggestion contains A
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log pass-bg">Pass</span></td>
        <td>12:03:47 AM</td>
        <td>
          search suggestion are displayed as expected
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:47 AM</td>
        <td>
          EnteringAlin search field
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:48 AM</td>
        <td>
          Validating search suggestion contains Al
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log pass-bg">Pass</span></td>
        <td>12:03:58 AM</td>
        <td>
          search suggestion are displayed as expected
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:58 AM</td>
        <td>
          EnteringAliin search field
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:03:59 AM</td>
        <td>
          Validating search suggestion contains Ali
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log pass-bg">Pass</span></td>
        <td>12:04:09 AM</td>
        <td>
          search suggestion are displayed as expected
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log pass-bg">Pass</span></td>
        <td>12:04:09 AM</td>
        <td>
          Passed
        </td>
      </tr>
  </tbody>
</table>
</div>
          </div>
        </li>
        <li class="test-item"  status="pass" test-id="7"
          author="Pragya"
          tag="Functional"
          device="">
          <div class="status-avatar pass-bg">
            <i class="fa fa-check text-white"></i>
          </div>
          <div class="test-detail">
            <span class="meta text-white badge badge-sm"></span>
            <p class="name">Search By Keyword</p>
            <p class="text-sm"><span>00:04:09 AM</span> / <span>12.055 secs</span></p>
          </div>
          <div class="test-contents d-none">
<div class="detail-head">
<div class="p-v-10">
<div class="info">
<div class='float-right'><span class='badge badge-default'>#test-id=7</span></div>
<h5 class="test-status text-pass">Search By Keyword</h5>
<span class='badge badge-success'>05.21.2023 00:04:09</span>
<span class='badge badge-danger'>05.21.2023 00:04:21</span>
<span class='badge badge-default'>12.055 secs</span>
</div>
<div class="m-t-15"><span class="badge badge-pill badge-default"> Pragya</span>
<span class="badge badge-pill badge-default"> Functional</span></div>
</div>
</div><div class="detail-body mt-4">
<table class="table table-sm">
  <thead><tr><th class="status-col">Status</th><th class="timestamp-col">Timestamp</th><th class="details-col">Details</th></tr></thead>
  <tbody>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:09 AM</td>
        <td>
          Verify that the search results page displays books by the selected keyword.
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:09 AM</td>
        <td>
          EnteringAlicein search field
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:14 AM</td>
        <td>
          clicking on search button
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:20 AM</td>
        <td>
          verifying search results contains keyword asAlice
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log pass-bg">Pass</span></td>
        <td>12:04:21 AM</td>
        <td>
          Passed
        </td>
      </tr>
  </tbody>
</table>
</div>
          </div>
        </li>
        <li class="test-item"  status="pass" test-id="8"
          author="Pragya"
          tag="Functional"
          device="">
          <div class="status-avatar pass-bg">
            <i class="fa fa-check text-white"></i>
          </div>
          <div class="test-detail">
            <span class="meta text-white badge badge-sm"></span>
            <p class="name">Select Author From Autosuggestion Test</p>
            <p class="text-sm"><span>00:04:21 AM</span> / <span>10.957 secs</span></p>
          </div>
          <div class="test-contents d-none">
<div class="detail-head">
<div class="p-v-10">
<div class="info">
<div class='float-right'><span class='badge badge-default'>#test-id=8</span></div>
<h5 class="test-status text-pass">Select Author From Autosuggestion Test</h5>
<span class='badge badge-success'>05.21.2023 00:04:21</span>
<span class='badge badge-danger'>05.21.2023 00:04:32</span>
<span class='badge badge-default'>10.957 secs</span>
</div>
<div class="m-t-15"><span class="badge badge-pill badge-default"> Pragya</span>
<span class="badge badge-pill badge-default"> Functional</span></div>
</div>
</div><div class="detail-body mt-4">
<table class="table table-sm">
  <thead><tr><th class="status-col">Status</th><th class="timestamp-col">Timestamp</th><th class="details-col">Details</th></tr></thead>
  <tbody>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:21 AM</td>
        <td>
          Verify that the search results page displays books by the selected author.
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:21 AM</td>
        <td>
          EnteringAlicein search field
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:26 AM</td>
        <td>
          Selected Alice Barker from author suggestion list
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:32 AM</td>
        <td>
          Verifying whether selected author get autopopulated in search field
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:32 AM</td>
        <td>
          Verifying whether search result page displays books/series whose author is Alice Barker
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log pass-bg">Pass</span></td>
        <td>12:04:32 AM</td>
        <td>
          Passed
        </td>
      </tr>
  </tbody>
</table>
</div>
          </div>
        </li>
        <li class="test-item"  status="pass" test-id="9"
          author="Pragya"
          tag="Functional"
          device="">
          <div class="status-avatar pass-bg">
            <i class="fa fa-check text-white"></i>
          </div>
          <div class="test-detail">
            <span class="meta text-white badge badge-sm"></span>
            <p class="name">Select Title From Autosuggestion Test</p>
            <p class="text-sm"><span>00:04:32 AM</span> / <span>10.584 secs</span></p>
          </div>
          <div class="test-contents d-none">
<div class="detail-head">
<div class="p-v-10">
<div class="info">
<div class='float-right'><span class='badge badge-default'>#test-id=9</span></div>
<h5 class="test-status text-pass">Select Title From Autosuggestion Test</h5>
<span class='badge badge-success'>05.21.2023 00:04:32</span>
<span class='badge badge-danger'>05.21.2023 00:04:42</span>
<span class='badge badge-default'>10.584 secs</span>
</div>
<div class="m-t-15"><span class="badge badge-pill badge-default"> Pragya</span>
<span class="badge badge-pill badge-default"> Functional</span></div>
</div>
</div><div class="detail-body mt-4">
<table class="table table-sm">
  <thead><tr><th class="status-col">Status</th><th class="timestamp-col">Timestamp</th><th class="details-col">Details</th></tr></thead>
  <tbody>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:32 AM</td>
        <td>
          Verify that the search results page displays books by the selected title.
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:32 AM</td>
        <td>
          EnteringAlicein search field
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:37 AM</td>
        <td>
          Selected Alice Adams from title suggestion list
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:42 AM</td>
        <td>
          Verifying whether search result page displays books/series whose title is Alice Adams
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log pass-bg">Pass</span></td>
        <td>12:04:42 AM</td>
        <td>
          Passed
        </td>
      </tr>
  </tbody>
</table>
</div>
          </div>
        </li>
        <li class="test-item"  status="pass" test-id="10"
          author="Pragya"
          tag="Functional"
          device="">
          <div class="status-avatar pass-bg">
            <i class="fa fa-check text-white"></i>
          </div>
          <div class="test-detail">
            <span class="meta text-white badge badge-sm"></span>
            <p class="name">Special Character Search Query</p>
            <p class="text-sm"><span>00:04:42 AM</span> / <span>4.571 secs</span></p>
          </div>
          <div class="test-contents d-none">
<div class="detail-head">
<div class="p-v-10">
<div class="info">
<div class='float-right'><span class='badge badge-default'>#test-id=10</span></div>
<h5 class="test-status text-pass">Special Character Search Query</h5>
<span class='badge badge-success'>05.21.2023 00:04:42</span>
<span class='badge badge-danger'>05.21.2023 00:04:47</span>
<span class='badge badge-default'>4.571 secs</span>
</div>
<div class="m-t-15"><span class="badge badge-pill badge-default"> Pragya</span>
<span class="badge badge-pill badge-default"> Functional</span></div>
</div>
</div><div class="detail-body mt-4">
<table class="table table-sm">
  <thead><tr><th class="status-col">Status</th><th class="timestamp-col">Timestamp</th><th class="details-col">Details</th></tr></thead>
  <tbody>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:42 AM</td>
        <td>
          Verify that the search results page handles the special characters appropriately, returning relevant results.
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:42 AM</td>
        <td>
          EnteringAl1ice@#3!*&in search field
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:45 AM</td>
        <td>
          Storing all search suggestion webelements in list for actualInput
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:47 AM</td>
        <td>
          Storing all search suggestion webelements in list for expectedInput
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log info-bg">Info</span></td>
        <td>12:04:47 AM</td>
        <td>
          Comparing actual Suggestionlist and ExpectedSuggestionList
        </td>
      </tr>
      <tr class="event-row">
        <td><span class="badge log pass-bg">Pass</span></td>
        <td>12:04:47 AM</td>
        <td>
          Passed
        </td>
      </tr>
  </tbody>
</table>
</div>
          </div>
        </li>
      </ul>
    </div>
  </div>
<div class="test-content scrollable">
<div class="test-content-tools">
<ul><li><a class="back-to-test" href="#"><i class="fa fa-arrow-left"></i></a></li></ul>
</div>
<div class="test-content-detail"><div class="detail-body"></div></div>
</div></div>
<div class="test-wrapper row view category-view attributes-view">
<div class="test-list">
<div class="test-list-tools">
<ul class="tools pull-left"><li><a href=""><span class="font-size-14">Tags</span></a></li></ul>
<ul class="tools text-right"><li><a href="#"><span class="badge badge-primary">2</span></a></li></ul>
</div>
<div class="test-list-wrapper scrollable">
<ul class="test-list-item">
<li class="test-item">
<div class="test-detail">
<span class="meta">
<span class='badge log pass-bg'>10</span>
</span>
<p class="name">Functional</p>
<p class="duration text-sm">10 tests</p>
</div>
<div class="test-contents d-none">
<div class="info">
<h4>Functional</h4>
<span status="pass" class='badge log pass-bg'>10 passed</span>
</div>
<table class='table table-sm mt-4'>
<thead>
<tr>
<th class="status-col">Status</th>
<th class="timestamp-col">Timestamp</th>
<th>TestName</th>
</tr>
</thead>
<tbody>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:03:13 AM</td>
<td>
<a href="#" class="linked" test-id='1' id='1'>Author Name Suggestion Order Test</a>
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:03:15 AM</td>
<td>
<a href="#" class="linked" test-id='2' id='2'>Auto Suggestion Search Test</a>
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:03:15 AM</td>
<td>
<a href="#" class="linked" test-id='3' id='3'>Book Title Suggestion Order Test</a>
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:03:16 AM</td>
<td>
<a href="#" class="linked" test-id='4' id='4'>Case Insensitivity Search Query</a>
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:03:31 AM</td>
<td>
<a href="#" class="linked" test-id='5' id='5'>Invalid Search Query</a>
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:03:37 AM</td>
<td>
<a href="#" class="linked" test-id='6' id='6'>Real Time Search SuggestionsTest</a>
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:04:09 AM</td>
<td>
<a href="#" class="linked" test-id='7' id='7'>Search By Keyword</a>
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:04:21 AM</td>
<td>
<a href="#" class="linked" test-id='8' id='8'>Select Author From Autosuggestion Test</a>
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:04:32 AM</td>
<td>
<a href="#" class="linked" test-id='9' id='9'>Select Title From Autosuggestion Test</a>
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:04:42 AM</td>
<td>
<a href="#" class="linked" test-id='10' id='10'>Special Character Search Query</a>
</td>
</tr>
</tbody>
</table>
</div>
</li>
<li class="test-item">
<div class="test-detail">
<span class="meta">
<span class='badge log pass-bg'>1</span>
</span>
<p class="name">Smoke</p>
<p class="duration text-sm">1 tests</p>
</div>
<div class="test-contents d-none">
<div class="info">
<h4>Smoke</h4>
<span status="pass" class='badge log pass-bg'>1 passed</span>
</div>
<table class='table table-sm mt-4'>
<thead>
<tr>
<th class="status-col">Status</th>
<th class="timestamp-col">Timestamp</th>
<th>TestName</th>
</tr>
</thead>
<tbody>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:03:37 AM</td>
<td>
<a href="#" class="linked" test-id='6' id='6'>Real Time Search SuggestionsTest</a>
</td>
</tr>
</tbody>
</table>
</div>
</li>
</ul>
</div>
</div>
<div class="test-content scrollable">
<div class="test-content-tools">
<ul>
<li>
<a class="back-to-test" href="javascript:void(0)">
<i class="fa fa-arrow-left"></i>
</a>
</li>
</ul>
</div>
<div class="test-content-detail">
<div class="detail-body"></div>
</div>
</div>
</div><div class="test-wrapper row view author-view attributes-view">
<div class="test-list">
<div class="test-list-tools">
<ul class="tools pull-left"><li><a href=""><span class="font-size-14">Authors</span></a></li></ul>
<ul class="tools text-right"><li><a href="#"><span class="badge badge-primary">1</span></a></li></ul>
</div>
<div class="test-list-wrapper scrollable">
<ul class="test-list-item">
<li class="test-item">
<div class="test-detail">
<span class="meta">
<span class='badge log pass-bg'>10</span>
</span>
<p class="name">Pragya</p>
<p class="duration text-sm">10 tests</p>
</div>
<div class="test-contents d-none">
<div class="info">
<h4>Pragya</h4>
<span status="pass" class='badge log pass-bg'>10 passed</span>
</div>
<table class='table table-sm mt-4'>
<thead>
<tr>
<th class="status-col">Status</th>
<th class="timestamp-col">Timestamp</th>
<th>TestName</th>
</tr>
</thead>
<tbody>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:03:13 AM</td>
<td class='linked' test-id='1'>
Author Name Suggestion Order Test
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:03:15 AM</td>
<td class='linked' test-id='2'>
Auto Suggestion Search Test
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:03:15 AM</td>
<td class='linked' test-id='3'>
Book Title Suggestion Order Test
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:03:16 AM</td>
<td class='linked' test-id='4'>
Case Insensitivity Search Query
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:03:31 AM</td>
<td class='linked' test-id='5'>
Invalid Search Query
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:03:37 AM</td>
<td class='linked' test-id='6'>
Real Time Search SuggestionsTest
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:04:09 AM</td>
<td class='linked' test-id='7'>
Search By Keyword
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:04:21 AM</td>
<td class='linked' test-id='8'>
Select Author From Autosuggestion Test
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:04:32 AM</td>
<td class='linked' test-id='9'>
Select Title From Autosuggestion Test
</td>
</tr>
<tr class="tag-test-status" status="pass">
<td><span class="badge log pass-bg">Pass</span></td>
<td>00:04:42 AM</td>
<td class='linked' test-id='10'>
Special Character Search Query
</td>
</tr>
</tbody>
</table>
</div>
</li>
</ul>
</div>
</div>
<div class="test-content scrollable">
<div class="test-content-tools">
<ul>
<li>
<a class="back-to-test" href="#">
<i class="fa fa-arrow-left"></i>
</a>
</li>
</ul>
</div>
<div class="test-content-detail">
<div class="detail-body"></div>
</div>
</div>
</div><div class="container-fluid p-4 view dashboard-view">
<div class="row">
<div class="col-md-3">
<div class="card"><div class="card-body">
<p class="m-b-0">Started</p>
<h3>May 21, 2023 12:03:06 AM</h3>
</div></div>
</div>
<div class="col-md-3">
<div class="card"><div class="card-body">
<p class="m-b-0">Ended</p>
<h3>May 21, 2023 12:04:47 AM</h3>
</div></div>
</div>
<div class="col-md-3">
<div class="card"><div class="card-body">
<p class="m-b-0 text-pass">Tests Passed</p>
<h3>10</h3>
</div></div>
</div>
<div class="col-md-3">
<div class="card"><div class="card-body">
<p class="m-b-0 text-fail">Tests Failed</p>
<h3>0</h3>
</div></div>
</div>
</div>
<div class="row">
<div class="col-md-6">
<div class="card">
<div class="card-header">
<h6 class="card-title">Tests</h6>
</div>
<div class="card-body">
<div class="">
<canvas id='parent-analysis' width='115' height='90'></canvas>
</div>
</div>
<div class="card-footer">
<div><small data-tooltip='100%'>
<b>10</b> tests passed
</small>
</div>
<div>
<small data-tooltip='0%'><b>0</b> tests failed,
<b>0</b> skipped, <b data-tooltip='0%'>0</b> others
</small>
</div>
</div>
</div>
</div>
<div class="col-md-6">
<div class="card">
<div class="card-header">
<h6 class="card-title">Log events</h6>
</div>
<div class="card-body">
<div class="">
<canvas id='events-analysis' width='115' height='90'></canvas>
</div>
</div>
<div class="card-footer">
<div><small data-tooltip='24%'><b>13</b> events passed</small></div>
<div>
<small data-tooltip='0%'><b>0</b> events failed,
<b data-tooltip='%'>40</b> others
</small>
</div>
</div>
</div>
</div>
</div>
<div class="row">
<div class="col-md-4 author-container">
<div class="card">
<div class="card-header"><p>Author</p></div>
<div class="card-body pb-0 pt-0"><table class="table table-sm table-bordered">
<thead><tr class="bg-gray"><th>Name</th><th>Passed</th><th>Failed</th><th>Skipped</th><th>Others</th><th>Passed %</th></tr></thead>
<tbody>
<tr>
<td>Pragya</td>
<td>10</td>
<td>0</td>
<td>0</td>
<td>0</td>
<td>100%</td>
</tr>
</tbody>
</table></div>
</div>
</div>
<div class="col-md-4 category-container">
<div class="card">
<div class="card-header"><p>Tags</p></div>
<div class="card-body pb-0 pt-0"><table class="table table-sm table-bordered">
<thead><tr class="bg-gray"><th>Name</th><th>Passed</th><th>Failed</th><th>Skipped</th><th>Others</th><th>Passed %</th></tr></thead><tbody>
<tr>
<td>Functional</td>
<td>10</td>
<td>0</td>
<td>0</td>
<td>0</td>
<td>100%</td>
</tr>
<tr>
<td>Smoke</td>
<td>1</td>
<td>0</td>
<td>0</td>
<td>0</td>
<td>100%</td>
</tr>
</tbody>
</table></div>
</div>
</div>
</div>
</div>
<script>
var statusGroup = {
parentCount: 5,
passParent: 10,
failParent: 0,
warningParent: 0,
skipParent: 0,
childCount: 5,
passChild: 0,
failChild: 0,
warningChild: 0,
skipChild: 0,
infoChild: 0,
grandChildCount: 5,
passGrandChild: 0,
failGrandChild: 0,
warningGrandChild: 0,
skipGrandChild: 0,
infoGrandChild: 0,
eventsCount: 5,
passEvents: 13,
failEvents: 0,
warningEvents: 0,
skipEvents: 0,
infoEvents: 40
};
</script>        </div>
      </div>
    </div>
  </div>
<script src="https://cdn.jsdelivr.net/gh/extent-framework/extent-github-cdn@5cf22a596531402644b8523470526952516f345f/spark/js/spark-script.js"></script>
<script type="text/javascript"></script></body>
