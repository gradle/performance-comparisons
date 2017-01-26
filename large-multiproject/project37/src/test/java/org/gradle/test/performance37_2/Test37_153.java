package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_153 {
    private final Production37_153 production = new Production37_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}