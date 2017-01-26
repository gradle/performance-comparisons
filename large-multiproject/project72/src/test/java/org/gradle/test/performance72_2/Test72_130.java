package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_130 {
    private final Production72_130 production = new Production72_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}