package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_409 {
    private final Production37_409 production = new Production37_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}