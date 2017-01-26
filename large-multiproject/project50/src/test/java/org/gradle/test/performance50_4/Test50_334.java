package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_334 {
    private final Production50_334 production = new Production50_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}