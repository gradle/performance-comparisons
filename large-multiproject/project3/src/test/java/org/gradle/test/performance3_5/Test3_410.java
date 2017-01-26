package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_410 {
    private final Production3_410 production = new Production3_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}