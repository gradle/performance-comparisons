package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_287 {
    private final Production47_287 production = new Production47_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}