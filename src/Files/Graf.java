package Matrix;

public class Graf {
	/**
     * @param args the command line arguments
     */
     
    static String findAdj(int [][] g,int e){       
         
        String adj = "";
        for (int i = 0; i < g[e].length; i++) {
            if (g[e][i] == 1){
                  adj += i+" - "; 
            }
        }     
         
        return adj;      
         
    } 
     
     
    static int[] findMaxIndegre(int [][] g){       
         
        int maxInDegre = 0; 
        int [] allIndegre = new int[g[0].length];
        for (int i = 0; i < g[0].length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                //jagged array
                if (g[j][i] == 1){
                   allIndegre[i]++;                     
                }
            }
        }
         
        return allIndegre;
         
    } 
     
     
    static String[] findAlledges(int [][] g){       
         
        String edges[] = new String[g[0].length];
         
        for (int i = 0; i < g[0].length; i++) {
            for (int j = 0; j < g[0].length; j++) {
                if (g[i][j] == 1){
                    edges[i] += " - "+j; 
                }
            }
        }
           
         
        return edges;      
         
    } 
    public static void main(String[] args) {
        
                             //0,1,2,3,4,5,6,7,8,9,10,11,12,13,14
        int [][] adjMatrix = {{0,0,0,0,0,1,1,0,0,0, 0, 0, 0, 0, 0},
                              {0,0,0,0,0,0,1,1,0,0, 0, 0, 0, 0, 0},
                              {0,0,0,1,0,0,0,0,0,0, 0, 0, 0, 0, 0},
                              {0,0,0,0,1,0,0,0,0,0, 0, 0 ,0 ,0 ,0},
                              {0,0,0,0,0,0,0,0,0,1, 0, 0 ,0 ,0 ,0},
                              {0,0,0,0,0,0,1,0,0,0, 0, 0, 0, 0, 0},
                              {0,1,0,0,0,0,0,1,0,0, 0, 0, 0, 0, 0},
                              {0,0,1,0,0,0,0,0,0,0, 0, 0, 0, 1, 0},
                              {0,0,0,0,0,0,0,1,0,0, 0, 0, 0, 0, 0},
                              {0,0,0,1,0,0,0,0,0,0, 0, 0, 0, 0, 1},
                              {0,0,0,0,0,1,0,0,0,0, 0, 0, 0, 0, 0},
                              {0,0,0,0,0,0,1,0,0,0, 0, 0, 0, 0, 0},
                              {0,0,0,0,0,0,1,1,0,0, 0, 1, 0, 0, 0},
                              {0,0,0,0,0,0,0,0,0,0, 0, 0, 1, 0, 0},
                              {0,0,0,0,0,0,0,0,0,0, 0, 0, 0, 0, 0}};
         
        int node = 9;
        System.out.println(node+". dugumun komsuları = "+findAdj(adjMatrix, node));    
        int [] indegre = findMaxIndegre(adjMatrix);
        for (int i = 0; i < adjMatrix[0].length; i++) {
            System.out.println(i+". node in degre value = "+indegre[i]);
        }
         System.out.println("******************************************************");
       String [] edges =  findAlledges(adjMatrix);
        
        for (int i = 0; i < edges.length; i++) {
             System.out.println(i+". node kosuları = "+edges[i]);
        }
         
    
    
    }
}
         
    

