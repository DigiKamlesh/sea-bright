package com.adobe.aem.guides.bright.core.services;
import javax.jcr.NodeIterator;
import javax.jcr.RepositoryException;
import javax.jcr.Node;
import javax.jcr.Session;
import org.osgi.service.component.annotations.Component;
import com.day.cq.replication.PathNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service=NewService.class,immediate=true)
public class NewServiceImpl implements NewService {
    private static final Logger log = LoggerFactory.getLogger(NewServiceImpl.class);
    public String getChildNodes(Session session, String path) throws PathNotFoundException, RepositoryException {
        log.debug("inside service : path is " + path);
        Node mainNode = session.getNode(path);
        NodeIterator nI = mainNode.getNodes();
        while (nI.hasNext()) {
            Node curentNode = nI.nextNode();
            log.debug("current node is : " + curentNode.getPath());
        }
        return null;
    }

    @Override
    public String prepareResponse(Session session, String path, String property) throws javax.jcr.PathNotFoundException, RepositoryException {
        return null;
    }
}
