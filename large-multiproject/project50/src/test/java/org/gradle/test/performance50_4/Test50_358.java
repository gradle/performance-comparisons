package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_358 {
    private final Production50_358 production = new Production50_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}