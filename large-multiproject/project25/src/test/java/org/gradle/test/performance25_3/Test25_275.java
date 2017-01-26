package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_275 {
    private final Production25_275 production = new Production25_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}