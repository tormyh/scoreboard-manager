# Scoreboard library

A library with the purpose of handling starting matches, updating match scores, finishing a match currently in progress, and getting a summary of matches currently in progress ordered by total score (in case of tie, returned ordered by the most recently started match).

## Usage
`MatchManager.startMatch(String homeTeam, String awayTeam)`
Creates a Match object, setting it's properties to:
* id: a new generated id
* homeTeam: homeTeam
* awayTeam: awayTeam
* homeScore: 0
* awayScore: 0
* startTime: LocalDateTime.now()

`MatchManager.setHomeAwayScore(int id, int homeGoals, int awayGoals)`
Updates scores for specified match id

`Scoreboard.getScoreboard()`
Returns a List with all active matches, ordered by total goals, and in case of total goals by most recently started

`MatchManager.endMatch(int id)`
Ends match and removes from List of active matches

## Initial idea:
* Use ArrayList to store active matches, and Comparator to sort by total score
* Use separate ArrayList to store not started or finished matches
* Write/read matches to/from a .txt file?
* Create a Match class with properties: id, homeTeam, homeScore, awayTeam, awayScore, startTime, status(enum?)
* Create methods to create new matches, start matches (add to active List), update home and away goals, finish matches currently in progress (remove from active List)

### Additional thoughts during development:
* Rename activeMatches List to scoreboard, or create a new Scoreboard service with the purpose of returning scoreboard?
    * Decided to start with new Scoreboard service
* Realized the direction I was going was not very Library like, so figured I would stop overcomplicating things and try to keep it simple like specified in the task document - note that this is my first time making a library (have only made programs until now)
    * Stopped giving services formatting responsibility
    * Removed match status, as well as inactive matches (Task description only specifies that active matches should be returned, so figured there is no need to keep a list of not started or finished matches.)
    * Simplified start match method (startMatch method now also creates the match)

## Something to note:
I only started self-learning Java on December 16, exactly two weeks before submission, so everything I did for this implementation was done with the knowledge I had acquired up until this point, and without assistance from Copilot. (I made it a point to not rely on copilot for this task, to prove to myself as well as demonstrate what I have learned during these two weeks)

**Timeline for this task:**
- Began planning and got started with development Sunday Dec. 28.
- Had a working library meeting the task requirements by Tuesday Dec. 30.

Almost all of my spare time since December 16. have gone towards learning and practicing Java and development in general, which I have found to be both interesting and exciting, and I will continue to do so moving forwards.

I realize however that my work so far does not adhere all that well to SOLID principles, and I have also not had time to practice/learn proper TDD (Only did tests via Main.java during development). So this is something I know is lacking at the moment, but is something I will look into in the coming days.