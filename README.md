# Orange_Praktyka_Java_Zadanie
Zadanie wykonane w ramach procesu rekrutacyjnego Praktyka Orange #Java #Spring#Unit

Testowanie aplikacji:

W klasie Main jest przygotowany zestaw testowych danych wejściowych,
które pokazują pełne działanie programu. 

Jeżeli życzą sobie Państwo użyć do testowania własnych danych wejściowych, przedstawiam jak to zrobić:

Potrzebne są dwa obiekty klasy Schedule. W ich konstruktorze podaje się imię właściciela kalendarza.

Następnie poprzez metodę setWorkingHours(X), gdzie X to obiekt klasy WorkingHours, w którego
konstruktorze należy podać godzinę rozpoczęcia i zakończenia jako typ String oraz bez 
wiodącego zera (przykładowo "8:00", "16:45").

W celu dodania spotkania do kalendarza należy użyć metody addMeeting(x, y), gdzie x i y są to 
kolejno godzina rozpoczęcia oraz zakończenia spotkania jako typ String, podawane w tym samym formacie 
co w konstruktorze WorkingHours.

Metoda displayMeetings() służy do zweryfikowania poprawności wprowadzonych danych, poprzez wyświetlenie terminów spotkań
na konsoli.

Przy pomocy metody powołanego obiektu klasy MeetingPlanner findAvailableMeeting(X, Y, Z), gdzie X i Y są to
obiekty klasy Schedule, czyli kalendarze, dla których będa szukane możliwe spotkania, a Z to oczekiwany czas
trwania spotkania podany przy pomocy zmiennej typu String bez wiodącego zera (przykładowo "1:30" lub "0:15")
