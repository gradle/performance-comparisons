package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_221 {
    private final Production3_221 production = new Production3_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}