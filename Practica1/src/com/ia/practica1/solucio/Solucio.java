package com.ia.practica1.solucio;

import java.util.Vector;

import IA.Desastres.Centros;
import IA.Desastres.Grupo;
import IA.Desastres.Grupos;

public class Solucio {

	class RecojidaGrupo {
		public Grupo g;
		public int helicopter;
		public int ordre;
	}

	private static Grupos mGrupos;
	private static Centros mCentros;

	private RecojidaGrupo[] mRecojida;

	public Solucio(Grupos grupos, Centros centros) {
		mGrupos = grupos;
		mCentros = centros;

		// GENERAR ESTAT INICIAL
	}

	public Solucio(RecojidaGrupo[] recojida) {
		mRecojida = new RecojidaGrupo[recojida.length];
		for (int i = 0; i < recojida.length; i++) {
			mRecojida[i] = recojida[i];
		}
	}
	
	public void mover(int grupo, int h1, int h2) {
		
	}

	public void intercanviar(int i0, int j0, int i1, int j1) {
		Grupo aux = mRecojida.get(i0).get(j0);
		Grupo aux2 = mRecojida.
		mRecojida.get(i0).setElementAt(, );
	}
}
