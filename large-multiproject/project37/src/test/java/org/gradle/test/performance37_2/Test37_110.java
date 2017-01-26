package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_110 {
    private final Production37_110 production = new Production37_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}