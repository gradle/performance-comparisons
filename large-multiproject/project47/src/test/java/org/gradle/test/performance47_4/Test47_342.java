package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_342 {
    private final Production47_342 production = new Production47_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}