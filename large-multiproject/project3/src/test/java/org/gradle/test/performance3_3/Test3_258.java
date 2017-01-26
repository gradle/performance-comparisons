package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_258 {
    private final Production3_258 production = new Production3_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}