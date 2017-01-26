package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_273 {
    private final Production3_273 production = new Production3_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}