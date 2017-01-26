package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_132 {
    private final Production25_132 production = new Production25_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}