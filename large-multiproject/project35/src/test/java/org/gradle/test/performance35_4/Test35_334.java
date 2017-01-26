package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_334 {
    private final Production35_334 production = new Production35_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}