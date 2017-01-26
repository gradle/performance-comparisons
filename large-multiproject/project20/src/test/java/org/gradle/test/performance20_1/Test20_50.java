package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_50 {
    private final Production20_50 production = new Production20_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}