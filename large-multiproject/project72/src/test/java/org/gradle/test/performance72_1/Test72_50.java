package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_50 {
    private final Production72_50 production = new Production72_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}