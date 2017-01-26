package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_180 {
    private final Production47_180 production = new Production47_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}