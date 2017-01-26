package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_384 {
    private final Production72_384 production = new Production72_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}