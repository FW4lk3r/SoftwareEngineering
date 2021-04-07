package com.es2.Bridge;

public class APIRequestContentAggregator extends APIRequest{

    public APIRequestContentAggregator() {}

    public String getContent(String serviceId, String contentId) throws ServiceNotFoundException{
        if(this.services.containsKey(serviceId)) {
            return this.services.get(serviceId).getContent(contentId);
        }
        throw new ServiceNotFoundException();
    }


}
