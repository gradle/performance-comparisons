package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_285 {
    private final Production72_285 production = new Production72_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}