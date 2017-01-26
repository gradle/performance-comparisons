package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_284 {
    private final Production72_284 production = new Production72_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}