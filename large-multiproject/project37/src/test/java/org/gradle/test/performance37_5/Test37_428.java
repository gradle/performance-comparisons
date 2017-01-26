package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_428 {
    private final Production37_428 production = new Production37_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}