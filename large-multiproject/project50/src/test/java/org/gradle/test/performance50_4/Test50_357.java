package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_357 {
    private final Production50_357 production = new Production50_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}