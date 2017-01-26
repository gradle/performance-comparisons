package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_52 {
    private final Production47_52 production = new Production47_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}