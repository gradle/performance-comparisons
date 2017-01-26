package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_409 {
    private final Production63_409 production = new Production63_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}