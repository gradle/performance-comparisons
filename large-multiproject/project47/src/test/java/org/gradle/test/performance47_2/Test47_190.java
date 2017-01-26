package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_190 {
    private final Production47_190 production = new Production47_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}