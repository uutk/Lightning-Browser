package acr.browser.lightning.adblock.source

/**
 * The provider for the hosts data source.
 */
interface HostsDataSourceProvider {

    /**
     * Create the hosts data source.
     */
    fun createHostsDataSource(): HostsDataSource

    /**
     * The identity of the hosts data source.
     */
    fun sourceIdentity(): String

}
