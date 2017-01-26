package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_428 {
    private final Production72_428 production = new Production72_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}