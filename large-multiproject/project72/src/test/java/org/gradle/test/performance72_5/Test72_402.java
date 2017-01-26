package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_402 {
    private final Production72_402 production = new Production72_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}