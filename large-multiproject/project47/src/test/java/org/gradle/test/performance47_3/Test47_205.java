package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_205 {
    private final Production47_205 production = new Production47_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}