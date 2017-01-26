package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_487 {
    private final Production72_487 production = new Production72_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}