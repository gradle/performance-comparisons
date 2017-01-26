package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_149 {
    private final Production47_149 production = new Production47_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}