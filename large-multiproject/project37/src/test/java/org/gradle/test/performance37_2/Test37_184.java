package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_184 {
    private final Production37_184 production = new Production37_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}