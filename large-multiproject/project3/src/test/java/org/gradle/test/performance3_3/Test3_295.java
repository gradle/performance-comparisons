package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_295 {
    private final Production3_295 production = new Production3_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}