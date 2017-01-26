package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_346 {
    private final Production50_346 production = new Production50_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}