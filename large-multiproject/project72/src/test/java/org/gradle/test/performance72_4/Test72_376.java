package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_376 {
    private final Production72_376 production = new Production72_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}