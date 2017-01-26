package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_357 {
    private final Production25_357 production = new Production25_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}