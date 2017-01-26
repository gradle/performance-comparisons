package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_272 {
    private final Production25_272 production = new Production25_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}