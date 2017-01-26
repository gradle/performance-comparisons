package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_441 {
    private final Production47_441 production = new Production47_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}