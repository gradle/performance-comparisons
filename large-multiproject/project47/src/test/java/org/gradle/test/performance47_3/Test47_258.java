package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_258 {
    private final Production47_258 production = new Production47_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}