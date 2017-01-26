package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_118 {
    private final Production3_118 production = new Production3_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}