package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_56 {
    private final Production30_56 production = new Production30_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}