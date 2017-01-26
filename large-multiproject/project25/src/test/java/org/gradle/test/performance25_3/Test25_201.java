package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_201 {
    private final Production25_201 production = new Production25_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}