package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_319 {
    private final Production72_319 production = new Production72_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}