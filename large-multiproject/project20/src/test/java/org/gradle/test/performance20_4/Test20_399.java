package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_399 {
    private final Production20_399 production = new Production20_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}