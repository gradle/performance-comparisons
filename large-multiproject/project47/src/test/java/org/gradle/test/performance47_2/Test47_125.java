package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_125 {
    private final Production47_125 production = new Production47_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}