package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_399 {
    private final Production37_399 production = new Production37_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}