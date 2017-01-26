package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_271 {
    private final Production25_271 production = new Production25_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}