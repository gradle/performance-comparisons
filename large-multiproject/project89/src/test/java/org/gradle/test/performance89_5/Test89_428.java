package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_428 {
    private final Production89_428 production = new Production89_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}