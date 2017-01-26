package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_483 {
    private final Production72_483 production = new Production72_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}