package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_493 {
    private final Production7_493 production = new Production7_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}