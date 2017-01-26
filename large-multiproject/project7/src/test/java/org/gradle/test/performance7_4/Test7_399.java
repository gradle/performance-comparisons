package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_399 {
    private final Production7_399 production = new Production7_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}