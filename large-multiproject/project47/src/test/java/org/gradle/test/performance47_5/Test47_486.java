package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_486 {
    private final Production47_486 production = new Production47_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}