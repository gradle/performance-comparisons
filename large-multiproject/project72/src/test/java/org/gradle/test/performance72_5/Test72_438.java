package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_438 {
    private final Production72_438 production = new Production72_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}