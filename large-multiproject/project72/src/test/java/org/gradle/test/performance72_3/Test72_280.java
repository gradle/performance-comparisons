package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_280 {
    private final Production72_280 production = new Production72_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}