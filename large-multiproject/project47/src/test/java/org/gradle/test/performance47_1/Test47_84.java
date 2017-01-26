package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_84 {
    private final Production47_84 production = new Production47_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}