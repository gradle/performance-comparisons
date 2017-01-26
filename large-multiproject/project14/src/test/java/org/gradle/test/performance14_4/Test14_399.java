package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_399 {
    private final Production14_399 production = new Production14_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}