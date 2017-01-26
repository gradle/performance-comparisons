package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_334 {
    private final Production25_334 production = new Production25_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}