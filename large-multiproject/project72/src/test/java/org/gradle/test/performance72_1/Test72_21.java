package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_21 {
    private final Production72_21 production = new Production72_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}