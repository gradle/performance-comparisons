package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_446 {
    private final Production3_446 production = new Production3_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}