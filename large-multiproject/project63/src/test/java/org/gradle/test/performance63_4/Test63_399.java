package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_399 {
    private final Production63_399 production = new Production63_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}