package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_254 {
    private final Production47_254 production = new Production47_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}