package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_493 {
    private final Production30_493 production = new Production30_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}