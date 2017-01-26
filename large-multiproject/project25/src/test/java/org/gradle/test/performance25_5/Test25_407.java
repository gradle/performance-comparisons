package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_407 {
    private final Production25_407 production = new Production25_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}