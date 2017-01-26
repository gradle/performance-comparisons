package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_256 {
    private final Production25_256 production = new Production25_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}