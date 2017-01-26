package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_122 {
    private final Production47_122 production = new Production47_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}