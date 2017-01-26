package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_11 {
    private final Production72_11 production = new Production72_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}