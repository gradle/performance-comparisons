package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_120 {
    private final Production72_120 production = new Production72_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}