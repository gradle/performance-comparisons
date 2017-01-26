package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_355 {
    private final Production72_355 production = new Production72_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}