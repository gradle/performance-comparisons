package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_285 {
    private final Production3_285 production = new Production3_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}