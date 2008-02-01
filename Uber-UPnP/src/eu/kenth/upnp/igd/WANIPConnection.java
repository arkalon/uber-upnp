/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.kenth.upnp.igd;

/**
 *
 * @author developer(Admin)
 */
public interface WANIPConnection {

    public void SetConnectionType();
    public void GetConnectionTypeInfo();
    public void RequestConnection();
    public void RequestTermination();
    public void ForceTermination();
    public void SetAutoDisconnectTime();
    public void SetIdleDisconnectTime();
    public void SetWarnDisconnectDelay();
    
    public void GetStatusInfo();
    public void GetNATRSIPStatus();
    public void GetGenericPortMappingEntry();
    public void GetSpecificPortMappingEntry();
    public void AddPortMapping();
    public void DeletePortMapping();
    public void GetExternalIPAddress();
    
    
}
