package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_469 {
    private final Production25_469 production = new Production25_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}