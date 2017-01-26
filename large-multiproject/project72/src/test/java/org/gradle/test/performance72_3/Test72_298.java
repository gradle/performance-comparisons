package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_298 {
    private final Production72_298 production = new Production72_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}