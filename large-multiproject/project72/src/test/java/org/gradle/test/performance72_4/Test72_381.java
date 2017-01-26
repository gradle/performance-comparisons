package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_381 {
    private final Production72_381 production = new Production72_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}