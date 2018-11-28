package station;

public class KoreaUniv extends Station {
	   public KoreaUniv(int day, int dir) {
	      if(day == 0 & dir == 0) {
	         int timetable[][] = {
	               {5, 35, 42, 49, 56},
	               {6, 3, 10, 17, 23, 29, 35, 41, 46, 51, 55, 59},
	               {7, 3, 7, 11, 15, 19, 23, 27, 31, 35, 39, 44, 48, 53, 57},
	               {8, 0, 4, 7, 11, 15, 19, 23, 27, 31, 35, 39, 44, 49, 55},
	               {9, 1, 7, 14, 21, 28, 35, 42, 49, 56},
	               {10, 3, 10, 17, 24, 31, 38, 45, 52, 59},
	               {11, 6, 13, 20, 27, 34, 41, 48, 55},
	               {12, 2, 9, 16, 23, 30, 37, 44, 51, 58},
	               {13, 5, 12, 19, 26, 33, 40, 47, 54},
	               {14, 1, 8, 15, 22, 29, 36, 43, 50, 57},
	               {15, 4, 11, 18, 25, 32, 39, 46, 53},
	               {16, 0, 7, 14, 21, 27, 33, 39, 45, 51, 57},
	               {17, 3, 9, 15, 21, 27, 33, 39, 45, 51, 57},
	               {18, 3, 9, 15, 20, 25, 30, 35, 40, 46, 52, 58},
	               {19, 4, 10, 16, 23, 30, 37, 44, 51, 58},
	               {20, 6, 14, 22, 30, 38, 46, 54},
	               {21, 2, 10, 18, 27, 36, 45, 54},
	               {22, 3, 12, 22, 31, 41, 52},
	               {23, 4, 12, 22, 31, 40, 49, 57},
	               {0, 15, 33, 57}
	         };
	      }
	      else if(day == 0 && dir == 1) {
	         int timetable[][] = {
	               {5, 31, 45, 58},
	               {6, 13, 23, 34, 45, 54},
	               {7, 3, 10, 18, 25, 32, 39, 46, 53},
	               {8, 0, 6, 12, 18, 22, 25, 29, 34, 38, 42, 46, 50, 54, 58},
	               {9, 2, 6, 10, 14, 18, 22, 26, 31, 35, 39, 43, 46, 50, 54, 58},
	               {10, 2, 6, 10, 15, 20, 26, 31, 37, 43, 49, 56},
	               {11, 3, 10, 17, 24, 31, 38, 45, 52, 59},
	               {12, 6, 13, 20, 27, 34, 41, 48, 55},
	               {13, 2, 9, 16, 23, 30, 37, 44, 51, 58},
	               {14, 5, 12, 19, 26, 33, 40, 47, 54},
	               {15, 1, 8, 15, 22, 29, 36, 43, 50, 57},
	               {16, 4, 11, 18, 25, 32, 39, 46, 53},
	               {17, 0, 7, 14, 21, 28, 35, 42, 49, 56},
	               {18, 3, 9, 15, 21, 27, 33, 39, 45, 51, 57},
	               {19, 3, 9, 15, 21, 27, 33, 39, 45, 51, 57},
	               {20, 2, 7, 12, 17, 22, 28, 34, 40, 46, 52, 58},
	               {21, 5, 12, 19, 26, 33, 40, 48, 56},
	               {22, 4, 12, 20, 28, 36, 44, 52},
	               {23, 0, 9, 18, 27, 36, 45, 54},
	               {0, 4, 13, 24, 35, 47}
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
