package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_169 {
    private final Production25_169 production = new Production25_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}