package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_409 {
    private final Production88_409 production = new Production88_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}