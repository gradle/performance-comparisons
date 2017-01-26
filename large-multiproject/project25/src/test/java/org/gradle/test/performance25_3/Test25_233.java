package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_233 {
    private final Production25_233 production = new Production25_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}