package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_357 {
    private final Production47_357 production = new Production47_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}