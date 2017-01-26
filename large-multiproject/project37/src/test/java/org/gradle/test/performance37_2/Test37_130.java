package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_130 {
    private final Production37_130 production = new Production37_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}