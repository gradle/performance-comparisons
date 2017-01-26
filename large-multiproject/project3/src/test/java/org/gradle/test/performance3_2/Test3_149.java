package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_149 {
    private final Production3_149 production = new Production3_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}