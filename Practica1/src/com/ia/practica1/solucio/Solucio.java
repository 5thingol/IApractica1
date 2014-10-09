package com.ia.practica1.solucio;

import java.util.ArrayList;
import java.util.Vector;

import IA.Desastres.Centros;
import IA.Desastres.Grupo;
import IA.Desastres.Grupos;

public class Solucio {
jodeeerrrr
	public int cost;

	class RecogidaGrupo {
		public int grup;
		// TRUE: Anira al centre abans de buscar al grup
		public boolean sortida;
	}

	private static Grupos mGrupos;
	private static Centros mCentros;

	private Vector<ArrayList<RecogidaGrupo>> mRecogida;

	public Solucio(Grupos grupos, Centros centros) {
		mGrupos = grupos;
		mCentros = centros;

		// GENERAR ESTAT INICIAL
		
	}

	public Solucio(Vector<ArrayList<RecogidaGrupo>> recogida) {
		mRecogida = new Vector<ArrayList<RecogidaGrupo>>();
		for (int i = 0; i < recogida.size(); i++) {
			mRecogida.add(recogida.get(i));
		}
	}
	
	public int getNombreGrupsHelicopter(int helicopter) {
		return mRecogida.get(helicopter).size();
	}

	
	public void mover(int grupo, int h1, int h2) {
		holaaaaaaaaaa
	}
	
	public void intercanviar(int i1, int j1, int i2, int j2) {
		
	}
}
