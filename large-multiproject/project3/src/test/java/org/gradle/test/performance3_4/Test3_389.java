package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_389 {
    private final Production3_389 production = new Production3_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}