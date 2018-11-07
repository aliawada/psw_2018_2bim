package listaencadeada;

public interface Iterador<T> {
	T getDado();
	T proximo();
	T anterior();
}