package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_198 {
    private final Production98_198 production = new Production98_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}