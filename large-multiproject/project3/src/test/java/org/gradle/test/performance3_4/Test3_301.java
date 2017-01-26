package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_301 {
    private final Production3_301 production = new Production3_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}