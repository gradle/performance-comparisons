package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_105 {
    private final Production72_105 production = new Production72_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}