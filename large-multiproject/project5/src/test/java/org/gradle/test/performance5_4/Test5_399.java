package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_399 {
    private final Production5_399 production = new Production5_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}