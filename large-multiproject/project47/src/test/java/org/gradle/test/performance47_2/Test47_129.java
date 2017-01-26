package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_129 {
    private final Production47_129 production = new Production47_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}