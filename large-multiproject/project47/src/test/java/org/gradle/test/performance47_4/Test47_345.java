package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_345 {
    private final Production47_345 production = new Production47_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}