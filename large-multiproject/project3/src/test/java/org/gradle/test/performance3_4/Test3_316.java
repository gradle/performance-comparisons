package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_316 {
    private final Production3_316 production = new Production3_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}