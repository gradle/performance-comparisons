package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_375 {
    private final Production72_375 production = new Production72_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}