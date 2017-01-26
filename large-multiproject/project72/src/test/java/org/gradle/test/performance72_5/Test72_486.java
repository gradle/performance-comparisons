package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_486 {
    private final Production72_486 production = new Production72_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}