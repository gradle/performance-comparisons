package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_292 {
    private final Production72_292 production = new Production72_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}