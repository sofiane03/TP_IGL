package com.company;

public class VectorHelper {


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

    // La méthode invVect inverse tout les éléments d'un vecteur
    public void invVect (int [] v){
        int taille = v.length;
        int [] tmp = new int[taille];

        for (int i=0 ; i < taille; i++){
            tmp[i] = v[i];
        }
        for (int i = 0 ; i <taille ; i++){
            v[i] = tmp[taille - 1 - i];
        }
    }


    // La méthode maxVect renvoit la valeur maximum d'un vecteur donné
    public int maxVect (int [] v){
        int max = v[0];
        for (int i = 1 ; i< v.length ; i++){
            if (v[i]>max) max = v[i];
        }

        return max;
    }


    // La méthode minVect renvoit la valeur minimum d'un vecteur donné
    public int minVect (int [] v) {
        int min = v[0];
        for (int i = 1 ; i< v.length ; i++){
            if (v[i]<min) min = v[i];
        }

        return min;
    }

}
