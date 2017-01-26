package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_277 {
    private final Production72_277 production = new Production72_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}