package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_131 {
    private final Production3_131 production = new Production3_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}