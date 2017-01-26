package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_223 {
    private final Production72_223 production = new Production72_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}