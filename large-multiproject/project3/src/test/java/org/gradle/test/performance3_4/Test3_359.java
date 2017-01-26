package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_359 {
    private final Production3_359 production = new Production3_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}