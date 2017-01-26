package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_56 {
    private final Production4_56 production = new Production4_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}