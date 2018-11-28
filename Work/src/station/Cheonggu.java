package station;

public class Cheonggu extends Station {
	   public Cheonggu(int day, int dir) {
	      if(day == 0 & dir == 0) {
	         int timetable[][] = {
	               {5, 38, 45, 52, 59},
	               {6, 6, 13, 20, 27, 33, 39, 45, 51, 56},
	               {7, 1, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 54, 58},
	               {8, 3, 7, 10, 14, 17, 21, 25, 29, 33, 37, 41, 45, 49, 54, 59},
	               {9, 5, 11, 17, 24, 31, 38, 45, 52, 59},
	               {10, 6, 13, 20, 27, 34, 41, 48, 55},
	               {11, 2, 9, 16, 23, 30, 37, 44, 51, 58},
	               {12, 5, 12, 19, 26, 33, 40, 47, 54},
	               {13, 1, 8, 15, 22, 29, 36, 43, 50, 57},
	               {14, 4, 11, 18, 25, 32, 39, 46, 53},
	               {15, 0, 7, 14, 21, 28, 35, 42, 49, 56},
	               {16, 3, 10, 17, 24, 31, 37, 43, 49, 55},
	               {17, 1, 7, 13, 19, 25, 31, 37, 43, 49, 55},
	               {18, 1, 7, 13, 19, 25, 30, 35, 40, 45, 50, 56},
	               {19, 2, 8, 14, 20, 26, 33, 40, 47, 54},
	               {20, 1, 8, 16, 24, 32, 40, 48, 56},
	               {21, 4, 12, 20, 28, 37, 46, 55},
	               {22, 4, 13, 22, 32, 41, 51},
	               {23, 2, 14, 22, 32, 41, 50, 59},
	               {0, 7, 25, 43}
	         };
	      }
	      else if(day == 0 && dir == 1) {
	         int timetable[][] = {
	               {5, 35, 48},
	               {6, 3, 14, 24, 35, 44, 53},
	               {7, 0, 8, 15, 22, 29, 36, 43, 50, 56},
	               {8, 2, 8, 12, 15, 19, 24, 28, 32, 36, 40, 44, 48, 52, 56},
	               {9, 0, 4, 8, 12, 16, 21, 25, 29, 33, 36, 40, 44, 48, 52, 56},
	               {10, 0, 5, 10, 16, 21, 27, 33, 39, 46, 53},
	               {11, 0, 7, 14, 21, 28, 35, 42, 49, 56},
	               {12, 3, 10, 17, 24, 31, 38, 45, 52, 59},
	               {13, 6, 13, 20, 27, 34, 41, 48, 55},
	               {14, 2, 9, 16, 23, 30, 37, 44, 51, 58},
	               {15, 5, 12, 19, 26, 33, 40, 47, 54},
	               {16, 1, 8, 15, 22, 29, 36, 43, 50, 57},
	               {17, 4, 11, 18, 25, 32, 39, 46, 53, 59},
	               {18, 5, 11, 17, 23, 29, 35, 41, 47, 53, 59},
	               {19, 5, 11, 17, 23, 29, 35, 41, 47, 52, 57},
	               {20, 2, 7, 12, 18, 24, 30, 36, 42, 48, 55},
	               {21, 2, 9, 16, 23, 30, 38, 46, 54},
	               {22, 2, 10, 18, 26, 34, 42, 50, 59},
	               {23, 8, 17, 26, 35, 44, 54},
	               {0, 3, 14, 25, 37}
	         };
	      }
	      else if(day == 1 && dir == 0) {
	         int timetable[][] = {
	               {5, },
	               {6, },
	               {7, },
	               {8, },
	               {9, },
	               {10, },
	               {11, },
	               {12, },
	               {13, },
	               {14, },
	               {15, },
	               {16, },
	               {17, },
	               {18, },
	               {19, },
	               {20, },
	               {21, },
	               {22, },
	               {23, },
	               {0, }
	         };
	      }
	      else if(day == 1 && dir == 1) {
	         int timetable[][] = {
	               {5, },
	               {6, },
	               {7, },
	               {8, },
	               {9, },
	               {10, },
	               {11, },
	               {12, },
	               {13, },
	               {14, },
	               {15, },
	               {16, },
	               {17, },
	               {18, },
	               {19, },
	               {20, },
	               {21, },
	               {22, },
	               {23, },
	               {0}
	         };
	      }
	   }
	}