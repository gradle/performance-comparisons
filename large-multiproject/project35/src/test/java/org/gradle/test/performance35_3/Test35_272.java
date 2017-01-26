package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_272 {
    private final Production35_272 production = new Production35_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}