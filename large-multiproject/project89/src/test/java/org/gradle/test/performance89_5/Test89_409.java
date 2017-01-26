package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_409 {
    private final Production89_409 production = new Production89_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}