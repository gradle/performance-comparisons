package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_312 {
    private final Production3_312 production = new Production3_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}