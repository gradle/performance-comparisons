package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_148 {
    private final Production25_148 production = new Production25_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}