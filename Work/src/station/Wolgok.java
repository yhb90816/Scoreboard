package station;

public class Wolgok extends Station {
	   public Wolgok(int day, int dir) {
	      if(day == 0 & dir == 0) {
	         int timetable[][] = {
	               {5, 33, 40, 47, 54},
	               {6, 1, 8, 15, 21, 27, 33, 39, 44, 49, 53, 57},
	               {7, 1, 5, 9, 13, 17, 21, 25, 29, 33, 37, 42, 46, 51, 55, 58},
	               {8, 2, 5, 9, 13, 17, 21, 25, 29, 33, 37, 42, 47, 53, 59},
	               {9, 5, 12, 19, 26, 33, 40, 47, 54},
	               {10, 1, 8, 15, 22, 29, 36, 43, 50, 57},
	               {11, 4, 11, 18, 25, 32, 39, 46, 53},
	               {12, 0, 7, 14, 21, 28, 35, 42, 49, 56},
	               {13, 3, 10, 17, 24, 31, 38, 45, 52, 59},
	               {14, 6, 13, 20, 27, 34, 41, 48, 55},
	               {15, 2, 9, 16, 23, 30, 37, 44, 51, 58},
	               {16, 5, 12, 19, 25, 31, 37, 43, 49, 55},
	               {17, 1, 7, 13, 19, 25, 31, 37, 43, 49, 55},
	               {18, 1, 7, 13, 18, 23, 28, 33, 38, 44, 50, 56},
	               {19, 2, 8, 14, 21, 28, 35, 42, 49, 56},
	               {20, 4, 12, 20, 28, 36, 44, 52},
	               {21, 0, 8, 16, 25, 34, 43, 52},
	               {22, 1, 10, 20, 29, 39, 50},
	               {23, 2, 10, 20, 29, 38, 47, 55},
	               {0, 13, 31, 55}
	         };
	      }
	      else if(day == 0 && dir == 1) {
	         int timetable[][] = {
	               {5, 33, 47},
	               {6, 0, 15, 26, 36, 47, 56},
	               {7, 5, 12, 20, 27, 34, 41, 48, 55},
	               {8, 2, 8, 14, 20, 24, 27, 31, 36, 40, 44, 48, 52, 56},
	               {9, 0, 4, 8, 12, 16, 20, 24, 28, 33, 37, 41, 45, 48, 52, 56},
	               {10, 0, 4, 8, 12, 17, 22, 28, 33, 39, 45, 51, 58},
	               {11, 5, 12, 19, 26, 33, 40, 47, 54},
	               {12, 1, 8, 15, 22, 29, 36, 43, 50, 57},
	               {13, 4, 11, 18, 25, 32, 39, 46, 53},
	               {14, 0, 7, 14, 21, 28, 35, 42, 49, 56},
	               {15, 3, 10, 17, 24, 31, 38, 45, 52, 59},
	               {16, 6, 13, 20, 27, 34, 41, 48, 55},
	               {17, 2, 9, 16, 23, 30, 37, 44, 51, 58},
	               {18, 5, 11, 17, 23, 29, 35, 41, 47, 53, 59},
	               {19, 5, 11, 17, 23, 29, 35, 41, 47, 53, 59},
	               {20, 4, 9, 14, 19, 24, 30, 36, 42, 48, 54},
	               {21, 0, 7, 14, 21, 28, 35, 42, 50, 58},
	               {22, 6, 14, 22, 30, 38, 46, 54},
	               {23, 2, 11, 20, 29, 38, 47, 56},
	               {0, 6, 15, 26, 37, 49}
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