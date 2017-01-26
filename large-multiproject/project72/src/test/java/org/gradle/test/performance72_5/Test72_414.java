package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_414 {
    private final Production72_414 production = new Production72_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}