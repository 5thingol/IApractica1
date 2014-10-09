package com.ia.practica1.solucio;

import java.util.ArrayList;
import java.util.Vector;

import IA.Desastres.Centros;
import IA.Desastres.Grupo;
import IA.Desastres.Grupos;

public class Solucio {
	public int cost;

	class Recogida {
		public int grup;
		// TRUE: Anira al centre abans de buscar al grup
		public boolean sortida;
	}

	private static Grupos mGrupos;
	private static Centros mCentros;

	private Vector<ArrayList<Recogida>> mRecogida;

	public Solucio(Grupos grupos, Centros centros) {
		mGrupos = grupos;
		mCentros = centros;

		// GENERAR ESTAT INICIAL
		
	}

	public Solucio(Vector<ArrayList<Recogida>> recogida) {
		mRecogida = new Vector<ArrayList<Recogida>>();
		for (int i = 0; i < recogida.size(); i++) {
			mRecogida.add(recogida.get(i));
		}
	}

	public int getNombreGrupsHelicopter(int helicopter) {
		return mRecogida.get(helicopter).size();
	}

	// Mou el grup que recollia l'helicopter 1 en ordre grupo
	public void mover(int helicopter1, int grupo, int helicopter2, int posicion) {
		Recogida recogida = mRecogida.get(helicopter1).get(grupo);
		mRecogida.get(helicopter1).remove(grupo);
		mRecogida.get(helicopter2).add(posicion, recogida);
	}
	
	public void intercanviar(int helicopter1, int grupo1, int helicopter2,
			int grupo2) {

	}
}
