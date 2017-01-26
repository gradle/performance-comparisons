package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_129 {
    private final Production25_129 production = new Production25_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}