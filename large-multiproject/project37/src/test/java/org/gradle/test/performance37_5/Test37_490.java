package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_490 {
    private final Production37_490 production = new Production37_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}