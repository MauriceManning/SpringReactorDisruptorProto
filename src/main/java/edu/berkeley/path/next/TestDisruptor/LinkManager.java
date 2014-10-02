package edu.berkeley.path.next.TestDisruptor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mauricemanning on 9/16/14.
 */
public class LinkManager {

    public LinkDataRaw getLink() {

    final Logger logger = LogManager.getLogger(LinkManager.class.getName());

    logger.info("LinkManager initialized ");


    Point point1 = new Point();
    point1.setElevation(1.1);
    point1.setLatitude(2.2);
    point1.setLongitude(3.3);

    Point point2 = new Point();
    point2.setElevation(4.4);
    point2.setLatitude(5.5);
    point2.setLongitude(6.6);

    List<String> roadNames = Arrays.asList("Shattuck", "Telegraph", "College");
    List<Point> points = Arrays.asList(point1, point2);

    // how many links to put into the list
    int numberOfLinks = 1;

    LinkDataRaw ldr = new LinkDataRaw();

    long x = 0;
    String msg = "status";


    // fill the link with canned numbers
    ldr.setBeginNodeId(1L);
    ldr.setCapacity(50L);
    ldr.setEndNodeId(x);
    ldr.setIsSink(false);
    ldr.setIsSource(false);
    ldr.setIsValid(true);
    ldr.setLaneOffset(5.5);
    ldr.setLanes(5.0);
    ldr.setLength(5.0);
    ldr.setLinkid((double)x);
    ldr.setLinkName("LinkName");
    ldr.setNetworkid(5.0);
    ldr.setRunid(5.0);
    ldr.setSpeedLimit(75.0);
    ldr.setVehiclecount(100.0);
    ldr.setRoadNames(roadNames);
    ldr.setPoints(points);


    logger.info("LinkManager returning link ");
    return ldr;
}

}
