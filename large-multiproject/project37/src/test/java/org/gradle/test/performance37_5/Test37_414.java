package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_414 {
    private final Production37_414 production = new Production37_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}