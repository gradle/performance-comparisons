package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_370 {
    private final Production3_370 production = new Production3_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}