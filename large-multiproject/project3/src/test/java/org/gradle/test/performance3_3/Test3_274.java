package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_274 {
    private final Production3_274 production = new Production3_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}