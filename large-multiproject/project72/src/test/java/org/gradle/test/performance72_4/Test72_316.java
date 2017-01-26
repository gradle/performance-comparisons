package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_316 {
    private final Production72_316 production = new Production72_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}