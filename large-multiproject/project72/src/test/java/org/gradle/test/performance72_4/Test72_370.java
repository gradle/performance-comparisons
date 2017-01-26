package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_370 {
    private final Production72_370 production = new Production72_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}