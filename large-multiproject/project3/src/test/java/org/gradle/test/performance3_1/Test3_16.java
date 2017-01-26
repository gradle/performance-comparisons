package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_16 {
    private final Production3_16 production = new Production3_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}