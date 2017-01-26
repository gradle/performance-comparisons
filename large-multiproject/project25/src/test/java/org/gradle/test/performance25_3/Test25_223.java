package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_223 {
    private final Production25_223 production = new Production25_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}