package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_213 {
    private final Production47_213 production = new Production47_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}