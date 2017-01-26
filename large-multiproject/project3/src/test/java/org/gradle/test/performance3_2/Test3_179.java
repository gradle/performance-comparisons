package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_179 {
    private final Production3_179 production = new Production3_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}