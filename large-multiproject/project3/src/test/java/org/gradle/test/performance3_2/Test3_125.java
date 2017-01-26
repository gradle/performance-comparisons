package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_125 {
    private final Production3_125 production = new Production3_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}