package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_141 {
    private final Production72_141 production = new Production72_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}