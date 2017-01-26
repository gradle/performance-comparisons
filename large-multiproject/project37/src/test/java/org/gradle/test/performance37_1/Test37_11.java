package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_11 {
    private final Production37_11 production = new Production37_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}