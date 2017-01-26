package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_13 {
    private final Production72_13 production = new Production72_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}