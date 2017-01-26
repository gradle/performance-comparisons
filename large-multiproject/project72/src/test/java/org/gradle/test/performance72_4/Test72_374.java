package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_374 {
    private final Production72_374 production = new Production72_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}