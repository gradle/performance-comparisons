package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_316 {
    private final Production25_316 production = new Production25_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}