package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_272 {
    private final Production50_272 production = new Production50_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}