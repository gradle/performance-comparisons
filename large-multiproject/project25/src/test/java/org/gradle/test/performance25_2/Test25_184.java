package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_184 {
    private final Production25_184 production = new Production25_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}