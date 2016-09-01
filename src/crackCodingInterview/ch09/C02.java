package crackCodingInterview.ch09;

/**
 * Image a robot sitting on the upper left corner of an X by Y grid. The robot
 * can only move in two directions: right and down. How many possible paths are
 * there for the robot to go from (0, 0) to (X, Y)?
 * 
 * FOLLOW UP
 * 
 * Imagine certain spots are "off limits," such that the robot cannot step on
 * them. Design an algorithm to find a path for the robot from the top left to
 * the bottom.
 * 
 * 
 * 
 * @author mengchaowang
 *
 */
public class C02 {
	public int countWays(int X, int Y) {
		int[][] pos = new int[X + 1][Y + 1];
		pos[0][0] = 0;
		pos[0][1] = 1;
		pos[1][0] = 1;
		return countWays(pos, X, Y);

	}

	public int countWays(int[][] pos, int X, int Y) {
		if (X <= 0) {
			return 1;
		}
		if (Y <= 0) {
			return 1;
		}
		if (pos[X][Y] != 0) {
			return pos[X][Y];
		}
		int fromTop = countWays(pos, X - 1, Y);
		pos[X - 1][Y] = fromTop;
		int fromLeft = countWays(pos, X, Y - 1);
		pos[X][Y - 1] = fromLeft;
		pos[X][Y] = fromTop + fromLeft;
		return pos[X][Y];
	}

}
