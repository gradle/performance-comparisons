package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_407 {
    private final Production50_407 production = new Production50_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}