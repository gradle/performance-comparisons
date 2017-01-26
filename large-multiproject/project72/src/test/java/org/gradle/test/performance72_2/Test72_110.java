package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_110 {
    private final Production72_110 production = new Production72_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}