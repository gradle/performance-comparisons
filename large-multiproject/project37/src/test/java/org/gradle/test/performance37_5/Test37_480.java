package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_480 {
    private final Production37_480 production = new Production37_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}