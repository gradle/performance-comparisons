package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_328 {
    private final Production72_328 production = new Production72_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}