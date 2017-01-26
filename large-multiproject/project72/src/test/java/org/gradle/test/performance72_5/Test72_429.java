package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_429 {
    private final Production72_429 production = new Production72_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}