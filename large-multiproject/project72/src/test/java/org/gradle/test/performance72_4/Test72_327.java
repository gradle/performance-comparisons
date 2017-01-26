package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_327 {
    private final Production72_327 production = new Production72_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}