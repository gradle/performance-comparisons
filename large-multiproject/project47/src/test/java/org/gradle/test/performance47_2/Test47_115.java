package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_115 {
    private final Production47_115 production = new Production47_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}