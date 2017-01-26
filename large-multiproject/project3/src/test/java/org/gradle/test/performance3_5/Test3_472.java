package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_472 {
    private final Production3_472 production = new Production3_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}