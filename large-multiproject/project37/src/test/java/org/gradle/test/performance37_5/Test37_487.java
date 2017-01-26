package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_487 {
    private final Production37_487 production = new Production37_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}