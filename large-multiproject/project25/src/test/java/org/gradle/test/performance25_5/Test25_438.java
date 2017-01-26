package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_438 {
    private final Production25_438 production = new Production25_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}