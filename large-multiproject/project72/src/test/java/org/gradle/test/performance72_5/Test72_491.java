package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_491 {
    private final Production72_491 production = new Production72_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}