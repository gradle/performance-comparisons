package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_245 {
    private final Production72_245 production = new Production72_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}