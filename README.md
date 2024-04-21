# The given problem involves creating an Android app using Java in Android Studio. 
The app displays a dropdown list (Spinner) containing four semesters ("sem1", "sem2", "sem3", "sem4"). 
When a semester is selected from the dropdown list, the app displays the corresponding CGPA (Cumulative Grade Point Average) value associated with that semester.

## To achieve this, the main components of the solution are:

~ Layout XML (activity_main.xml): Defines the layout of the app, including the Spinner for selecting semesters and a TextView for displaying the CGPA.
~ String Resources (strings.xml): Contains string resources used in the app, such as the app name and the format for displaying CGPA.
~ Java Code (MainActivity.java): Contains the logic for populating the Spinner with semester options, handling the selection of semesters, and updating the TextView with the corresponding CGPA value based on the selected semester.
In the Java code, the updateCGPA() method determines the CGPA value based on the selected semester and sets the text of the TextView using a string resource for proper localization and flexibility.
This ensures that the CGPA text can be easily translated and maintained.

Overall, the solution provides a simple and effective way to create an Android app that dynamically displays CGPA values based on the selected semester.
