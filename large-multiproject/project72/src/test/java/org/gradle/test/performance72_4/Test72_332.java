package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_332 {
    private final Production72_332 production = new Production72_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}