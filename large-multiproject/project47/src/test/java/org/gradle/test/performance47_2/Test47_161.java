package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_161 {
    private final Production47_161 production = new Production47_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}