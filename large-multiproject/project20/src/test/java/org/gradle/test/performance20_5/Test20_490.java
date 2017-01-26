package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_490 {
    private final Production20_490 production = new Production20_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}