package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_399 {
    private final Production92_399 production = new Production92_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}