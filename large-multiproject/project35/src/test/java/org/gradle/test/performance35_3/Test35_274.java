package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_274 {
    private final Production35_274 production = new Production35_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}