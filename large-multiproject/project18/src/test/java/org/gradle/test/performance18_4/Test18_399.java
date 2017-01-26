package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_399 {
    private final Production18_399 production = new Production18_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}