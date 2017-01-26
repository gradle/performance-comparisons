package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_312 {
    private final Production72_312 production = new Production72_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}