package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_185 {
    private final Production25_185 production = new Production25_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}