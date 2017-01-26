package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_316 {
    private final Production37_316 production = new Production37_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}