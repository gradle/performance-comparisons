package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_176 {
    private final Production47_176 production = new Production47_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}