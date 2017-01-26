package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_349 {
    private final Production25_349 production = new Production25_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}