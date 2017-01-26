package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_344 {
    private final Production3_344 production = new Production3_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}