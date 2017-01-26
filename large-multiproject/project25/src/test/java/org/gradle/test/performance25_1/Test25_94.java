package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_94 {
    private final Production25_94 production = new Production25_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}