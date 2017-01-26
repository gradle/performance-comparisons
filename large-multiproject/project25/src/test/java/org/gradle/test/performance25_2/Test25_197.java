package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_197 {
    private final Production25_197 production = new Production25_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}