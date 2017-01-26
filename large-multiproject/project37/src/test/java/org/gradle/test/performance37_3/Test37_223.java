package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_223 {
    private final Production37_223 production = new Production37_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}