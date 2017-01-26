package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_13 {
    private final Production37_13 production = new Production37_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}