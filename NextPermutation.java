
private static Comparable[] nextPermutation(final Comparable[] c){
  
  //scanning from right to left, find the first element such that previous element is greater
  int first = get1stelement( c );
  if(first==-1) return null; //no greater perm exists
  
  //scan from left to right, get the first element such that its greater that first, swap first and the current element to increase index at first
  int second = c.length -1;
  while(c[second].compareTo(c[first])>=0)
    --second;
  swap(c,first,second);
  first++;
  
  //reverse the elements after first to set them in order that they are minimum(since they were at max earlier)
  second = c.length -1;
  while ( first < second )
			swap( c, first++, second-- );
	return c;
  
  private static int get1stelement( final Comparable[] c ) {
		for ( int i = c.length - 2; i >= 0; --i )
			if ( c[ i ].compareTo( c[ i + 1 ] ) < 0 )
				return i;
		return -1;
	}

	private static void swap( final Comparable[] c, final int i, final int j ) {
		final Comparable tmp = c[ i ];
		c[ i ] = c[ j ];
		c[ j ] = tmp;
	}
  
}

