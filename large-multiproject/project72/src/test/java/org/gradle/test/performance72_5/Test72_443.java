package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_443 {
    private final Production72_443 production = new Production72_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}