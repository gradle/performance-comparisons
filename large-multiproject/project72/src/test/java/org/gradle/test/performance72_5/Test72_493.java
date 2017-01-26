package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_493 {
    private final Production72_493 production = new Production72_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}