package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_208 {
    private final Production47_208 production = new Production47_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}