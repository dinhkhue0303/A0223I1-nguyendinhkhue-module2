public class TennisGame {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    static String score = "";
    static int tempScore = 0;

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        boolean isEqual = m_score1 == m_score2;
        boolean isScore1MoreOrEqual4 = m_score1 >= 4;
        boolean isScore2MoreOrEqual4 = m_score2 >= 4;


        if (isEqual) {
            score = getM_score1(m_score1);
        } else if (isScore1MoreOrEqual4 || isScore2MoreOrEqual4) {
            score = getScore(m_score1, m_score2);
        } else {
            score = getScore1(m_score1, m_score2);
        }
        return score;
    }

    public static String getM_score1(int m_score1) {
        switch (m_score1) {
            case ZERO:
                score = "Love-All";
                break;
            case ONE:
                score = "Fifteen-All";
                break;
            case TWO:
                score = "Thirty-All";
                break;
            case THREE:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    public static String getScore(int m_score1, int m_score2) {
        int minusResult = m_score1 - m_score2;
        boolean isMinusResultEqualOne = minusResult == 1;
        boolean isMinusResultEqualNegativeOne = minusResult == -1;
        boolean isMinusResultMoreOrEqualTwo = minusResult >= 2;
        if (isMinusResultEqualOne) score = "Advantage player1";
        else if (isMinusResultEqualNegativeOne) score = "Advantage player2";
        else if (isMinusResultMoreOrEqualTwo) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public static String getScore1(int m_score1, int m_score2) {
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = m_score1;
            else {
                score += "-";
                tempScore = m_score2;
            }
            switch (tempScore) {
                case ZERO:
                    score += "Love";
                    break;
                case ONE:
                    score += "Fifteen";
                    break;
                case TWO:
                    score += "Thirty";
                    break;
                case THREE:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}