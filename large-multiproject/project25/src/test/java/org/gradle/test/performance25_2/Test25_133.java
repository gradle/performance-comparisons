package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_133 {
    private final Production25_133 production = new Production25_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}