package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_333 {
    private final Production72_333 production = new Production72_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}