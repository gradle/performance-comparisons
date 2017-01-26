package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_252 {
    private final Production47_252 production = new Production47_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}