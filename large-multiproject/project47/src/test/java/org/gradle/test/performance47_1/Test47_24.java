package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_24 {
    private final Production47_24 production = new Production47_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}