package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_205 {
    private final Production3_205 production = new Production3_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}