package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_452 {
    private final Production25_452 production = new Production25_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}