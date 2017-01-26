package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_30 {
    private final Production3_30 production = new Production3_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}