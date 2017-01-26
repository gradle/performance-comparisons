package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_402 {
    private final Production25_402 production = new Production25_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}