package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_22 {
    private final Production3_22 production = new Production3_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}