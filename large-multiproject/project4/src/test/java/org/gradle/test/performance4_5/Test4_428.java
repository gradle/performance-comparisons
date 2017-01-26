package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_428 {
    private final Production4_428 production = new Production4_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}