<H2>TestCases Package</h2>  This repository contains test cases for a code package. The test cases are written in Java using TestNG and Selenium WebDriver. The tests are designed to verify the functionality of a search feature on a website.  <h3>Prerequisites</h3>  Before running the test cases, make sure you have the following prerequisites set up:<br> Java Development Kit (JDK)<br> TestNG framework<br> Selenium WebDriver<br> A web browser (Chrome, Firefox, etc.)<br> Download and install the necessary dependencies<br>  <h3>Setup</h3> Clone the repository to your local machine.<br> Set up the necessary dependencies and ensure they are properly configured. <br> Open the project in your preferred Java IDE.<br> <h3>Test Cases</h3> The following test cases are included in this package:<br> <br> 1. <b>realTimeSearchSuggestionsTest()</b><br>    Description: Verify that the search suggestions are displayed in real-time as the query is entered. <br>    Test Name: Real Time Search Suggestions Test<br>    Author: Pragya<br>    Categories: Functional, Smoke<br>    This test case verifies that the search suggestions are dynamically displayed as the user enters their search query. It iterates through each character of a predefined string, enters the character into the search field, and validates the displayed search suggestions.<br> <br> 2. <b>autoSuggestionSearchTest()</b><br>    Description: Verify that the autocomplete suggestions are displayed. <br>    Test Name: Auto Suggestion Search Test<br>    Author: Pragya<br>    Category: Functional<br>    This test case checks if autocomplete suggestions are displayed when a specific search query is entered. It sets a predefined search query and validates the presence of autocomplete suggestions.<br><br>  3. <b>authorNameSuggestionOrderTest()</b><br>    Description: Verify that the author names in the autosuggestion dropdown are displayed in alphabetical order. <br>    Test Name: Author Name Suggestion Order Test<br>    Author: Pragya<br>    Category: Functional<br>    This test case validates that the author names displayed in the autosuggestion dropdown are in alphabetical order. It enters a search query, retrieves the author name suggestions, and verifies their order.<br><br>  4. <b>bookTitleSuggestionOrderTest()</b><br>    Description: Verify that the book titles in the autosuggestion dropdown are displayed in alphabetical order. <br>    Test Name: Book Title Suggestion Order Test<br>    Author: Pragya<br>    Category: Functional<br>    This test case ensures that the book titles displayed in the autosuggestion dropdown are in alphabetical order. It enters a search query, retrieves the book title suggestions, and checks their order. <br><br> 5. <b>selectAuthorFromAutosuggestionTest()</b><br>    Description: Verify that the search results page displays books by the selected author. <br>    Test Name: Select Author From Autosuggestion Test<br>    Author: Pragya<br>    Category: Functional<br>    This test case selects an author from the autosuggestion dropdown and validates that the search results page displays books by the selected author. It enters a search query, selects the desired author from the suggestion list, and checks if the search results match the selected author. <br><br> 6. <b>selectTitleFromAutosuggestionTest()</b><br>    Description: Verify that the search results page displays books by the selected title. <br>    Test Name: Select Title From Autosuggestion Test<br>    Author: Pragya<br>    Category: Functional<br>    This test case selects a book title from the autosuggestion dropdown and verifies that the search results page displays books with the selected title. It enters a search query, selects the desired title from the suggestion list, and validates if the search results match the selected title. <br><br> 7. <b>searchByKeyword()</b><br>    Description: Verify that the search results page displays books by the selected keyword. <br>Test Name: Search By Keyword<br>    Author: Pragya<br>    Category: Functional<br>    This test case verifies that the search results page displays books based on a specific keyword. It enters a search query, clicks the search button, and checks if the search results contain the specified keyword. <br><br> 8. <b>invalidSearchQuery()</b><br>    Description: Verify that the search results page displays an error message for an invalid search query.    <br>Test Name: Invalid Search Query<br>    Author: Pragya<br>    Category: Functional<br>    This test case tests the handling of an invalid search query. It enters an invalid search query, clicks the search button, and verifies if an error message is displayed on the search results page. <br><br> 9. <b>caseInsensitivitySearchQuery()</b><br>    Description: Verify that the search is case-insensitive and returns results regardless of the case used in the search query.    <br>Test Name: Case Insensitivity Search Query<br>    Author: Pragya<br>    Category: Functional<br>    This test case checks if the search functionality is case-insensitive. It enters a search query with different case variations, and validates if the search suggestions are displayed regardless of the case. <br><br> 10. <b>specialCharacterSearchQuery()</b><br>     Description: Verify that the search results page handles special characters appropriately, returning relevant results.     <br>Test Name: Special Character Search Query<br>     Author: Pragya<br>     Category: Functional<br>     This test case verifies the behavior of the search functionality when special characters are entered. It enters a search query containing special characters, retrieves the search suggestions for the modified query, and compares them to the expected suggestions. <br><br> <h3>Setup and Teardown</h3> <b>setUp() method</b>: Initializes the test environment and configuration before running the test cases. <br><b>tearDown() method</b>: Cleans up the test environment and closes the browser after running the test cases. <h3>Running the Test Cases</h3> To run the test cases, follow these steps: <br> Set up the necessary dependencies and configurations.<br> Execute the test cases by running the test class SearchBookTest in your preferred Java IDE. <br>View the test reports generated by the ExtendReport class for detailed test results. <br>Feel free to modify the test cases or add more tests as needed to further enhance the test coverage for the code package.
