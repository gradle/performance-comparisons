package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_50 {
    private final Production37_50 production = new Production37_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}