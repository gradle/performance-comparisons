package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_478 {
    private final Production72_478 production = new Production72_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}