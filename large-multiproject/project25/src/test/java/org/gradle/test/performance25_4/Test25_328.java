package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_328 {
    private final Production25_328 production = new Production25_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}