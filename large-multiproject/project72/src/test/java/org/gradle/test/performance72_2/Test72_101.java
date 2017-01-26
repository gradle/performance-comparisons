package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_101 {
    private final Production72_101 production = new Production72_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}