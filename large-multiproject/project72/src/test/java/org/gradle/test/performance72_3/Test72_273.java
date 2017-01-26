package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_273 {
    private final Production72_273 production = new Production72_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}