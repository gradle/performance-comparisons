package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_389 {
    private final Production72_389 production = new Production72_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}