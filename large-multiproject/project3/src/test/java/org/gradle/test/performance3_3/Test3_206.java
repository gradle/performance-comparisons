package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_206 {
    private final Production3_206 production = new Production3_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}