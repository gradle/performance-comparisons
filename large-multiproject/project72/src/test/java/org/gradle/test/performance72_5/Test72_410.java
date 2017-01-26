package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_410 {
    private final Production72_410 production = new Production72_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}