package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_436 {
    private final Production3_436 production = new Production3_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}