package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_95 {
    private final Production3_95 production = new Production3_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}