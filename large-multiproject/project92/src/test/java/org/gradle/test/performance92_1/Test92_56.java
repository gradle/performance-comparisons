package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_56 {
    private final Production92_56 production = new Production92_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}