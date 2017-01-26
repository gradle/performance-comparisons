package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_463 {
    private final Production72_463 production = new Production72_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}