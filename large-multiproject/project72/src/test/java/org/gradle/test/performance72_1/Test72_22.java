package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_22 {
    private final Production72_22 production = new Production72_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}