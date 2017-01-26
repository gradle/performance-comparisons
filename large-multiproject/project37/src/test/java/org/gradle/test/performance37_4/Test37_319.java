package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_319 {
    private final Production37_319 production = new Production37_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}