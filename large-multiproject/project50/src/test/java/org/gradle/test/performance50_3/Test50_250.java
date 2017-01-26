package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_250 {
    private final Production50_250 production = new Production50_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}