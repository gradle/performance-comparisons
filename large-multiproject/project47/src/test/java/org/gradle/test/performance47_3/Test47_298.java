package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_298 {
    private final Production47_298 production = new Production47_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}