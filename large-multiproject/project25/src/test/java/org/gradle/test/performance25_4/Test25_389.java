package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_389 {
    private final Production25_389 production = new Production25_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}