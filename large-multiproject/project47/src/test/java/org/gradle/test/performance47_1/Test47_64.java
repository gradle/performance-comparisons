package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_64 {
    private final Production47_64 production = new Production47_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}