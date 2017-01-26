package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_409 {
    private final Production58_409 production = new Production58_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}