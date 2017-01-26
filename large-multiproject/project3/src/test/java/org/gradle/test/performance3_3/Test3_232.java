package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_232 {
    private final Production3_232 production = new Production3_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}