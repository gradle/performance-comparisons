package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_453 {
    private final Production72_453 production = new Production72_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}