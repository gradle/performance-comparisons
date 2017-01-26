package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_328 {
    private final Production3_328 production = new Production3_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}