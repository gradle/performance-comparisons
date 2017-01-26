package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_384 {
    private final Production3_384 production = new Production3_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}