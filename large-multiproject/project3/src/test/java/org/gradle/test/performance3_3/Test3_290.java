package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_290 {
    private final Production3_290 production = new Production3_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}