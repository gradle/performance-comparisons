package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_291 {
    private final Production3_291 production = new Production3_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}