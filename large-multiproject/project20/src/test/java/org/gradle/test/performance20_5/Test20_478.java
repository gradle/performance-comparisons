package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_478 {
    private final Production20_478 production = new Production20_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}