package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_456 {
    private final Production50_456 production = new Production50_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}