package csci2320;

import java.util.List;

public class Graphs {
  public int[][] matrix = {
    {0,1,1,0,0},
    {0,1,1,1,0},
    {0,0,0,1,1},
    {0,1,0,0,1},
    {0,0,0,0,0}
  };
  public List<List<Integer>> adjList = List.of(
    List.of(1,2),
    List.of(1,2,3),
    List.of(3,4),
    List.of(1,4),
    List.of()
  );
  public int dfs(List<List<Integer>> graph, int current, int end) {
    if (current == end) return 0;
    int minSteps = 1000000000;
    for (var next: graph.get(current)) {
      int steps = dfs(graph, next, end);
      if (steps < minSteps) {
        minSteps = steps;
      }
    }
    return minSteps + 1;
  }
}
