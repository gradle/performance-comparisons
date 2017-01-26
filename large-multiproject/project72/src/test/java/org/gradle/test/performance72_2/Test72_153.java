package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_153 {
    private final Production72_153 production = new Production72_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}