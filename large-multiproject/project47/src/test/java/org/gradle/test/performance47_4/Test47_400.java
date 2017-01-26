package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_400 {
    private final Production47_400 production = new Production47_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}