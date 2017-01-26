package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_143 {
    private final Production47_143 production = new Production47_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}