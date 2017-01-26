package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_141 {
    private final Production3_141 production = new Production3_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}