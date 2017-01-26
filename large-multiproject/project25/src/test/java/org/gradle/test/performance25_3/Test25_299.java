package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_299 {
    private final Production25_299 production = new Production25_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}