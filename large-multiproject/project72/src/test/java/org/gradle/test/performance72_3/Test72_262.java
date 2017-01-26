package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_262 {
    private final Production72_262 production = new Production72_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}