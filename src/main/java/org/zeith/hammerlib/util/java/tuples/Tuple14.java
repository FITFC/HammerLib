package org.zeith.hammerlib.util.java.tuples;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tuple14<A, B, C, D, E, F, G, H, I, J, K, L, M, N>
		implements ITuple
{
	protected A a;
	protected B b;
	protected C c;
	protected D d;
	protected E e;
	protected F f;
	protected G g;
	protected H h;
	protected I i;
	protected J j;
	protected K k;
	protected L l;
	protected M m;
	protected N n;
	
	public Tuple14(A a, B b, C c, D d, E e, F f, G g, H h, I i, J j, K k, L l, M m, N n)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
		this.h = h;
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
		this.m = m;
		this.n = n;
	}
	
	public A a()
	{
		return a;
	}
	
	public B b()
	{
		return b;
	}
	
	public C c()
	{
		return c;
	}
	
	public D d()
	{
		return d;
	}
	
	public E e()
	{
		return e;
	}
	
	public F f()
	{
		return f;
	}
	
	public G g()
	{
		return g;
	}
	
	public H h()
	{
		return h;
	}
	
	public I i()
	{
		return i;
	}
	
	public J j()
	{
		return j;
	}
	
	public K k()
	{
		return k;
	}
	
	public L l()
	{
		return l;
	}
	
	public M m()
	{
		return m;
	}
	
	public N n()
	{
		return n;
	}
	
	public Tuple1<A> strip13R()
	{
		return Tuples.immutable(a);
	}
	
	public Tuple1<N> strip13L()
	{
		return Tuples.immutable(n);
	}
	
	public Tuple2<A, B> strip12R()
	{
		return Tuples.immutable(a, b);
	}
	
	public Tuple2<M, N> strip12L()
	{
		return Tuples.immutable(m, n);
	}
	
	public Tuple3<A, B, C> strip11R()
	{
		return Tuples.immutable(a, b, c);
	}
	
	public Tuple3<L, M, N> strip11L()
	{
		return Tuples.immutable(l, m, n);
	}
	
	public Tuple4<A, B, C, D> strip10R()
	{
		return Tuples.immutable(a, b, c, d);
	}
	
	public Tuple4<K, L, M, N> strip10L()
	{
		return Tuples.immutable(k, l, m, n);
	}
	
	public Tuple5<A, B, C, D, E> strip9R()
	{
		return Tuples.immutable(a, b, c, d, e);
	}
	
	public Tuple5<J, K, L, M, N> strip9L()
	{
		return Tuples.immutable(j, k, l, m, n);
	}
	
	public Tuple6<A, B, C, D, E, F> strip8R()
	{
		return Tuples.immutable(a, b, c, d, e, f);
	}
	
	public Tuple6<I, J, K, L, M, N> strip8L()
	{
		return Tuples.immutable(i, j, k, l, m, n);
	}
	
	public Tuple7<A, B, C, D, E, F, G> strip7R()
	{
		return Tuples.immutable(a, b, c, d, e, f, g);
	}
	
	public Tuple7<H, I, J, K, L, M, N> strip7L()
	{
		return Tuples.immutable(h, i, j, k, l, m, n);
	}
	
	public Tuple8<A, B, C, D, E, F, G, H> strip6R()
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h);
	}
	
	public Tuple8<G, H, I, J, K, L, M, N> strip6L()
	{
		return Tuples.immutable(g, h, i, j, k, l, m, n);
	}
	
	public Tuple9<A, B, C, D, E, F, G, H, I> strip5R()
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i);
	}
	
	public Tuple9<F, G, H, I, J, K, L, M, N> strip5L()
	{
		return Tuples.immutable(f, g, h, i, j, k, l, m, n);
	}
	
	public Tuple10<A, B, C, D, E, F, G, H, I, J> strip4R()
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j);
	}
	
	public Tuple10<E, F, G, H, I, J, K, L, M, N> strip4L()
	{
		return Tuples.immutable(e, f, g, h, i, j, k, l, m, n);
	}
	
	public Tuple11<A, B, C, D, E, F, G, H, I, J, K> strip3R()
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k);
	}
	
	public Tuple11<D, E, F, G, H, I, J, K, L, M, N> strip3L()
	{
		return Tuples.immutable(d, e, f, g, h, i, j, k, l, m, n);
	}
	
	public Tuple12<A, B, C, D, E, F, G, H, I, J, K, L> strip2R()
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l);
	}
	
	public Tuple12<C, D, E, F, G, H, I, J, K, L, M, N> strip2L()
	{
		return Tuples.immutable(c, d, e, f, g, h, i, j, k, l, m, n);
	}
	
	public Tuple13<A, B, C, D, E, F, G, H, I, J, K, L, M> strip1R()
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l, m);
	}
	
	public Tuple13<B, C, D, E, F, G, H, I, J, K, L, M, N> strip1L()
	{
		return Tuples.immutable(b, c, d, e, f, g, h, i, j, k, l, m, n);
	}
	
	
	public <O> Tuple15<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> add(O o)
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o);
	}
	
	public <O, P> Tuple16<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> add(O o, P p)
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p);
	}
	
	public <O, P, Q> Tuple17<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> add(O o, P p, Q q)
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q);
	}
	
	public <O, P, Q, R> Tuple18<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> add(O o, P p, Q q, R r)
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r);
	}
	
	public <O, P, Q, R, S> Tuple19<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> add(O o, P p, Q q, R r, S s)
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s);
	}
	
	public <O, P, Q, R, S, T> Tuple20<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> add(O o, P p, Q q, R r, S s, T t)
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
	}
	
	public <O, P, Q, R, S, T, U> Tuple21<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> add(O o, P p, Q q, R r, S s, T t, U u)
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u);
	}
	
	public <O, P, Q, R, S, T, U, V> Tuple22<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> add(O o, P p, Q q, R r, S s, T t, U u, V v)
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v);
	}
	
	public <O, P, Q, R, S, T, U, V, W> Tuple23<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> add(O o, P p, Q q, R r, S s, T t, U u, V v, W w)
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w);
	}
	
	public <O, P, Q, R, S, T, U, V, W, X> Tuple24<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> add(O o, P p, Q q, R r, S s, T t, U u, V v, W w, X x)
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x);
	}
	
	public <O, P, Q, R, S, T, U, V, W, X, Y> Tuple25<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> add(O o, P p, Q q, R r, S s, T t, U u, V v, W w, X x, Y y)
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y);
	}
	
	public <O, P, Q, R, S, T, U, V, W, X, Y, Z> Tuple26<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> add(O o, P p, Q q, R r, S s, T t, U u, V v, W w, X x, Y y, Z z)
	{
		return Tuples.immutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
	}
	
	public @Override int arity()
	{
		return 14;
	}
	
	public @Override Stream<?> stream()
	{
		return Stream.of(a, b, c, d, e, f, g, h, i, j, k, l, m, n);
	}
	
	public Tuple14.Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> mutable()
	{
		return new Tuple14.Mutable14<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n);
	}
	
	public Tuple14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> immutable()
	{
		return this;
	}
	
	public Tuple14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> copy()
	{
		return new Tuple14<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n);
	}
	
	public @Override String toString()
	{
		return "Tuple14" + stream().map(String::valueOf).collect(Collectors.joining(", ", "{", "}"));
	}
	
	public @Override int hashCode()
	{
		return java.util.Objects.hash(a, b, c, d, e, f, g, h, i, j, k, l, m, n);
	}
	
	public @Override
	@SuppressWarnings("rawtypes") boolean equals(Object other)
	{
		if(!(other instanceof Tuple14 tuple)) return false;
		return tuple.arity() == arity() && Tuples.streamEquals(stream(), tuple.stream());
	}
	
	public static class Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N>
			extends Tuple14<A, B, C, D, E, F, G, H, I, J, K, L, M, N>
	{
		public Mutable14(A a, B b, C c, D d, E e, F f, G g, H h, I i, J j, K k, L l, M m, N n)
		{
			super(a, b, c, d, e, f, g, h, i, j, k, l, m, n);
		}
		
		public @Override Tuple14.Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> mutable()
		{
			return this;
		}
		
		public @Override Tuple14.Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> copy()
		{
			return new Tuple14.Mutable14<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n);
		}
		
		public @Override Tuple14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> immutable()
		{
			return new Tuple14<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n);
		}
		
		public @Override String toString()
		{
			return "Tuple14.Mutable14" + stream().map(String::valueOf).collect(Collectors.joining(", ", "{", "}"));
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setA(A a)
		{
			this.a = a;
			return this;
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setB(B b)
		{
			this.b = b;
			return this;
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setC(C c)
		{
			this.c = c;
			return this;
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setD(D d)
		{
			this.d = d;
			return this;
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setE(E e)
		{
			this.e = e;
			return this;
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setF(F f)
		{
			this.f = f;
			return this;
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setG(G g)
		{
			this.g = g;
			return this;
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setH(H h)
		{
			this.h = h;
			return this;
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setI(I i)
		{
			this.i = i;
			return this;
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setJ(J j)
		{
			this.j = j;
			return this;
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setK(K k)
		{
			this.k = k;
			return this;
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setL(L l)
		{
			this.l = l;
			return this;
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setM(M m)
		{
			this.m = m;
			return this;
		}
		
		public Mutable14<A, B, C, D, E, F, G, H, I, J, K, L, M, N> setN(N n)
		{
			this.n = n;
			return this;
		}
		
		public @Override Tuple1.Mutable1<A> strip13R()
		{
			return Tuples.mutable(a);
		}
		
		public @Override Tuple1.Mutable1<N> strip13L()
		{
			return Tuples.mutable(n);
		}
		
		public @Override Tuple2.Mutable2<A, B> strip12R()
		{
			return Tuples.mutable(a, b);
		}
		
		public @Override Tuple2.Mutable2<M, N> strip12L()
		{
			return Tuples.mutable(m, n);
		}
		
		public @Override Tuple3.Mutable3<A, B, C> strip11R()
		{
			return Tuples.mutable(a, b, c);
		}
		
		public @Override Tuple3.Mutable3<L, M, N> strip11L()
		{
			return Tuples.mutable(l, m, n);
		}
		
		public @Override Tuple4.Mutable4<A, B, C, D> strip10R()
		{
			return Tuples.mutable(a, b, c, d);
		}
		
		public @Override Tuple4.Mutable4<K, L, M, N> strip10L()
		{
			return Tuples.mutable(k, l, m, n);
		}
		
		public @Override Tuple5.Mutable5<A, B, C, D, E> strip9R()
		{
			return Tuples.mutable(a, b, c, d, e);
		}
		
		public @Override Tuple5.Mutable5<J, K, L, M, N> strip9L()
		{
			return Tuples.mutable(j, k, l, m, n);
		}
		
		public @Override Tuple6.Mutable6<A, B, C, D, E, F> strip8R()
		{
			return Tuples.mutable(a, b, c, d, e, f);
		}
		
		public @Override Tuple6.Mutable6<I, J, K, L, M, N> strip8L()
		{
			return Tuples.mutable(i, j, k, l, m, n);
		}
		
		public @Override Tuple7.Mutable7<A, B, C, D, E, F, G> strip7R()
		{
			return Tuples.mutable(a, b, c, d, e, f, g);
		}
		
		public @Override Tuple7.Mutable7<H, I, J, K, L, M, N> strip7L()
		{
			return Tuples.mutable(h, i, j, k, l, m, n);
		}
		
		public @Override Tuple8.Mutable8<A, B, C, D, E, F, G, H> strip6R()
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h);
		}
		
		public @Override Tuple8.Mutable8<G, H, I, J, K, L, M, N> strip6L()
		{
			return Tuples.mutable(g, h, i, j, k, l, m, n);
		}
		
		public @Override Tuple9.Mutable9<A, B, C, D, E, F, G, H, I> strip5R()
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i);
		}
		
		public @Override Tuple9.Mutable9<F, G, H, I, J, K, L, M, N> strip5L()
		{
			return Tuples.mutable(f, g, h, i, j, k, l, m, n);
		}
		
		public @Override Tuple10.Mutable10<A, B, C, D, E, F, G, H, I, J> strip4R()
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j);
		}
		
		public @Override Tuple10.Mutable10<E, F, G, H, I, J, K, L, M, N> strip4L()
		{
			return Tuples.mutable(e, f, g, h, i, j, k, l, m, n);
		}
		
		public @Override Tuple11.Mutable11<A, B, C, D, E, F, G, H, I, J, K> strip3R()
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k);
		}
		
		public @Override Tuple11.Mutable11<D, E, F, G, H, I, J, K, L, M, N> strip3L()
		{
			return Tuples.mutable(d, e, f, g, h, i, j, k, l, m, n);
		}
		
		public @Override Tuple12.Mutable12<A, B, C, D, E, F, G, H, I, J, K, L> strip2R()
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l);
		}
		
		public @Override Tuple12.Mutable12<C, D, E, F, G, H, I, J, K, L, M, N> strip2L()
		{
			return Tuples.mutable(c, d, e, f, g, h, i, j, k, l, m, n);
		}
		
		public @Override Tuple13.Mutable13<A, B, C, D, E, F, G, H, I, J, K, L, M> strip1R()
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l, m);
		}
		
		public @Override Tuple13.Mutable13<B, C, D, E, F, G, H, I, J, K, L, M, N> strip1L()
		{
			return Tuples.mutable(b, c, d, e, f, g, h, i, j, k, l, m, n);
		}
		
		public @Override <O> Tuple15.Mutable15<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O> add(O o)
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o);
		}
		
		public @Override <O, P> Tuple16.Mutable16<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P> add(O o, P p)
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p);
		}
		
		public @Override <O, P, Q> Tuple17.Mutable17<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q> add(O o, P p, Q q)
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q);
		}
		
		public @Override <O, P, Q, R> Tuple18.Mutable18<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R> add(O o, P p, Q q, R r)
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r);
		}
		
		public @Override <O, P, Q, R, S> Tuple19.Mutable19<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S> add(O o, P p, Q q, R r, S s)
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s);
		}
		
		public @Override <O, P, Q, R, S, T> Tuple20.Mutable20<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T> add(O o, P p, Q q, R r, S s, T t)
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
		}
		
		public @Override <O, P, Q, R, S, T, U> Tuple21.Mutable21<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U> add(O o, P p, Q q, R r, S s, T t, U u)
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u);
		}
		
		public @Override <O, P, Q, R, S, T, U, V> Tuple22.Mutable22<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V> add(O o, P p, Q q, R r, S s, T t, U u, V v)
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v);
		}
		
		public @Override <O, P, Q, R, S, T, U, V, W> Tuple23.Mutable23<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W> add(O o, P p, Q q, R r, S s, T t, U u, V v, W w)
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w);
		}
		
		public @Override <O, P, Q, R, S, T, U, V, W, X> Tuple24.Mutable24<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X> add(O o, P p, Q q, R r, S s, T t, U u, V v, W w, X x)
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x);
		}
		
		public @Override <O, P, Q, R, S, T, U, V, W, X, Y> Tuple25.Mutable25<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y> add(O o, P p, Q q, R r, S s, T t, U u, V v, W w, X x, Y y)
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y);
		}
		
		public @Override <O, P, Q, R, S, T, U, V, W, X, Y, Z> Tuple26.Mutable26<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z> add(O o, P p, Q q, R r, S s, T t, U u, V v, W w, X x, Y y, Z z)
		{
			return Tuples.mutable(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
		}
	}
}