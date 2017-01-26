package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_152 {
    private final Production3_152 production = new Production3_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}