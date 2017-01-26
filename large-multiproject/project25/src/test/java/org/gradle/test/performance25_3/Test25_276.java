package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_276 {
    private final Production25_276 production = new Production25_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}