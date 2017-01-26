package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_341 {
    private final Production3_341 production = new Production3_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}