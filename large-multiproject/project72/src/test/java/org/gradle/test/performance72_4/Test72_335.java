package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_335 {
    private final Production72_335 production = new Production72_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}