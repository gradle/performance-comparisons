package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_311 {
    private final Production3_311 production = new Production3_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}