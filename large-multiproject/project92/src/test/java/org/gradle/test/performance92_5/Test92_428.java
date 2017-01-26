package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_428 {
    private final Production92_428 production = new Production92_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}