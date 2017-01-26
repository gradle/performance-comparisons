package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_493 {
    private final Production14_493 production = new Production14_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}