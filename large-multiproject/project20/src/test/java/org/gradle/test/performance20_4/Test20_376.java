package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_376 {
    private final Production20_376 production = new Production20_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}