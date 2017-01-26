package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_483 {
    private final Production37_483 production = new Production37_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}