package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_113 {
    private final Production47_113 production = new Production47_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}