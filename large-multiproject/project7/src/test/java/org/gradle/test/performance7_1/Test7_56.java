package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_56 {
    private final Production7_56 production = new Production7_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}