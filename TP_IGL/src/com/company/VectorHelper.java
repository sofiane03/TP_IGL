package com.company;

public class VectorHelper {

    public int [] sommeVec(int [] v1, int [] v2) throws TailleException
    {

            if(v1.length != v2.length) throw new TailleException() ;
            else {
                int [] v3 = new int[v1.length];
                for ( int i = 0 ; i < v1.length ; i++) {
                    v3[i] = v2[i] + v1[i] ;
                }
                return v3 ;
            }
    }

    public int [] formule(int [] v){
        int [] w = new int[v.length] ;
        for (int i=0 ; i<v.length; i ++){
            w[i] = v[i] * 2;
        }
        return w;


    }
    public void tri(int[] v) {
        int m ;
        for ( int i = 0 ; i < v.length ; i++){
            for (int k = v.length - 1 ; k > i ; k-- ){
                if (v[k] < v[k-1]) {
                    m = v[k] ;
                    v[k] = v[k-1] ;
                    v[k-1] = m ;
                }
            }
        }

    }

}
