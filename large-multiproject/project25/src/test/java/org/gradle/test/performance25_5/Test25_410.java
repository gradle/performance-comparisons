package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_410 {
    private final Production25_410 production = new Production25_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}