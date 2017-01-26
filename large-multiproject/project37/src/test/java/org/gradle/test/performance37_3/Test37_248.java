package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_248 {
    private final Production37_248 production = new Production37_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}