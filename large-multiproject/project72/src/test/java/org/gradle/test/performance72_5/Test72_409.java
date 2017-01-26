package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_409 {
    private final Production72_409 production = new Production72_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}