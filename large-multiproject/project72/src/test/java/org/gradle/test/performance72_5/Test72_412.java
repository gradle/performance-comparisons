package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_412 {
    private final Production72_412 production = new Production72_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}