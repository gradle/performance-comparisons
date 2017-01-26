package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_459 {
    private final Production25_459 production = new Production25_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}