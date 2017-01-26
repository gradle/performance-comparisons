package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_276 {
    private final Production47_276 production = new Production47_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}