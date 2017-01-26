package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_311 {
    private final Production47_311 production = new Production47_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}