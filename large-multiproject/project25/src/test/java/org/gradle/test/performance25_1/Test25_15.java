package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_15 {
    private final Production25_15 production = new Production25_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}