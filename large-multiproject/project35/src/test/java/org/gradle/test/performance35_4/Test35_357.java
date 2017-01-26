package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_357 {
    private final Production35_357 production = new Production35_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}