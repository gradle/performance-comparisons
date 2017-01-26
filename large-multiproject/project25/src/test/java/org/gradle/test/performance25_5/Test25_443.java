package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_443 {
    private final Production25_443 production = new Production25_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}