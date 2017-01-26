package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_387 {
    private final Production72_387 production = new Production72_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}