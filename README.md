# Scoreboard library

A library with the purpose of handling starting matches, updating match scores, finishing a match currently in progress, and getting a summary of matches currently in progress ordered by total score (in case of tie, returned ordered by the most recently started match).

## Initial idea:
* Use ArrayList to store active matches, and Comparator to sort by total score
* Use separate ArrayList to store not started or finished matches
* Write/read matches to/from a .txt file?
* Create a Match class with properties: id, homeTeam, homeScore, awayTeam, awayScore, startTime, status(enum?)
* Create methods to create new matches, start matches (add to active List), update home and away goals, finish matches currently in progress (remove from active List)

### Additional thoughts:
* Rename activeMatches List to scoreboard, or create a new Scoreboard service with the purpose of returning scoreboard?
    * Decided to start with new Scoreboard service
