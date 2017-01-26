package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_428 {
    private final Production63_428 production = new Production63_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}