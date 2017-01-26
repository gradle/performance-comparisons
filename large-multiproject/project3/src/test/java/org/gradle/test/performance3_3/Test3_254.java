package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_254 {
    private final Production3_254 production = new Production3_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}