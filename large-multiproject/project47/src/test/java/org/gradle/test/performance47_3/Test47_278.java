package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_278 {
    private final Production47_278 production = new Production47_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}