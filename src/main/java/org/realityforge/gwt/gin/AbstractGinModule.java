package org.realityforge.gwt.gin;

import com.google.gwt.inject.client.binder.GinScopedBindingBuilder;
import com.google.inject.name.Names;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.inject.Singleton;

@SuppressFBWarnings( "NM_SAME_SIMPLE_NAME_AS_SUPERCLASS" )
public abstract class AbstractGinModule
  extends com.google.gwt.inject.client.AbstractGinModule
{
  public enum ScopeType
  {
    EAGER_SINGLETON, SINGLETON, DEPENDENT
  }

  protected final <T> void bindService( final Class<T> service, final Class<? extends T> implementation )
  {
    bindService( service, implementation, ScopeType.EAGER_SINGLETON );
  }

  protected final <T> void bindService( final Class<T> service,
                                        final Class<? extends T> implementation,
                                        final ScopeType scope )
  {
    final GinScopedBindingBuilder builder = bind( service ).to( implementation );
    if ( ScopeType.EAGER_SINGLETON == scope )
    {
      builder.asEagerSingleton();
    }
    else if ( ScopeType.SINGLETON == scope )
    {
      builder.in( Singleton.class );
    }
  }

  protected final <T> void bindNamedService( final String name,
                                             final Class<T> service,
                                             final Class<? extends T> implementation )
  {
    bind( service ).annotatedWith( Names.named( name ) ).to( implementation ).asEagerSingleton();
  }
}
