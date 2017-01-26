package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_332 {
    private final Production3_332 production = new Production3_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}