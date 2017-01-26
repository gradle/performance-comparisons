package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_448 {
    private final Production3_448 production = new Production3_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}