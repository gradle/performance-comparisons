package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_142 {
    private final Production47_142 production = new Production47_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}