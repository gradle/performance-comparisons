package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_311 {
    private final Production72_311 production = new Production72_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}