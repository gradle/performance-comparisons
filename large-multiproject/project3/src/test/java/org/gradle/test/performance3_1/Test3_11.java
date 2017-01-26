package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_11 {
    private final Production3_11 production = new Production3_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}