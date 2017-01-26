package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_363 {
    private final Production3_363 production = new Production3_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}