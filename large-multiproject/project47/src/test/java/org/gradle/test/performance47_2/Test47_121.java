package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_121 {
    private final Production47_121 production = new Production47_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}