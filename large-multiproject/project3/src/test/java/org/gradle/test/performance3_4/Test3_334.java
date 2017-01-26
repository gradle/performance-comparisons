package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_334 {
    private final Production3_334 production = new Production3_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}