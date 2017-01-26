package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_405 {
    private final Production47_405 production = new Production47_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}