package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_399 {
    private final Production72_399 production = new Production72_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}