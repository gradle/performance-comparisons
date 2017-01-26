package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_56 {
    private final Production72_56 production = new Production72_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}