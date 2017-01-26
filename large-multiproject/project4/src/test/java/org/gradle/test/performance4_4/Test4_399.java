package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_399 {
    private final Production4_399 production = new Production4_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}