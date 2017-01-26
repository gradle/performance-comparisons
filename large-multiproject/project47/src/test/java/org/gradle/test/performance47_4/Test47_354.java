package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_354 {
    private final Production47_354 production = new Production47_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}