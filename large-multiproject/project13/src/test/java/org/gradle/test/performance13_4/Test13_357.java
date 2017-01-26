package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_357 {
    private final Production13_357 production = new Production13_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}