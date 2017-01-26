package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_467 {
    private final Production72_467 production = new Production72_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}