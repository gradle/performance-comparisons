package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_298 {
    private final Production3_298 production = new Production3_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}