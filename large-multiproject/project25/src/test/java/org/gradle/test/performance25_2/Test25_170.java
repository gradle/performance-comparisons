package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_170 {
    private final Production25_170 production = new Production25_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}