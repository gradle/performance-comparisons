package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_448 {
    private final Production72_448 production = new Production72_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}