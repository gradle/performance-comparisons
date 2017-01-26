package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_333 {
    private final Production37_333 production = new Production37_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}