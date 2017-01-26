package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_359 {
    private final Production72_359 production = new Production72_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}