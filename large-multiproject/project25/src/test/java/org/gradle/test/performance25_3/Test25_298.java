package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_298 {
    private final Production25_298 production = new Production25_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}