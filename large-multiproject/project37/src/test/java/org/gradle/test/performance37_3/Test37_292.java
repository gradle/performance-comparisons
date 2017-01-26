package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_292 {
    private final Production37_292 production = new Production37_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}