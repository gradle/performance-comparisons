package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_295 {
    private final Production25_295 production = new Production25_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}