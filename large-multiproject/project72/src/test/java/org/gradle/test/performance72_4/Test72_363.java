package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_363 {
    private final Production72_363 production = new Production72_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}