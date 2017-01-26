package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_56 {
    private final Production5_56 production = new Production5_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}