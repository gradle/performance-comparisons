package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_462 {
    private final Production72_462 production = new Production72_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}