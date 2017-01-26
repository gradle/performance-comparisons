package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_13 {
    private final Production3_13 production = new Production3_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}