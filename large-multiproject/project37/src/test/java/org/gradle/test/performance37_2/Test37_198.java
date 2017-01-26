package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_198 {
    private final Production37_198 production = new Production37_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}