package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_344 {
    private final Production72_344 production = new Production72_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}