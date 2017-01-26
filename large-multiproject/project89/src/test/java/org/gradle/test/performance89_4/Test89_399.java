package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_399 {
    private final Production89_399 production = new Production89_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}