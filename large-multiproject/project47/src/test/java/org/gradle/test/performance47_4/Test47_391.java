package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_391 {
    private final Production47_391 production = new Production47_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}