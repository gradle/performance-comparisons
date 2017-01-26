package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_208 {
    private final Production25_208 production = new Production25_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}