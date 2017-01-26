package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_287 {
    private final Production3_287 production = new Production3_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}