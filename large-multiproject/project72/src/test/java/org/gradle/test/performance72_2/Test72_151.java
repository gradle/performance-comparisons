package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_151 {
    private final Production72_151 production = new Production72_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}