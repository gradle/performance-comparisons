package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_451 {
    private final Production20_451 production = new Production20_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}