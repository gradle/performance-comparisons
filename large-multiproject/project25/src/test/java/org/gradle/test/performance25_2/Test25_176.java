package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_176 {
    private final Production25_176 production = new Production25_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}