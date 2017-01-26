package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_118 {
    private final Production72_118 production = new Production72_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}