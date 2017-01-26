package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_233 {
    private final Production72_233 production = new Production72_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}