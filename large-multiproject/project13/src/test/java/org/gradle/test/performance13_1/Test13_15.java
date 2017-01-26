package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_15 {
    private final Production13_15 production = new Production13_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}