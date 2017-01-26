package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_357 {
    private final Production75_357 production = new Production75_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}