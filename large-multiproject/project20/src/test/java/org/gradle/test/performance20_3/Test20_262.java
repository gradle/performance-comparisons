package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_262 {
    private final Production20_262 production = new Production20_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}