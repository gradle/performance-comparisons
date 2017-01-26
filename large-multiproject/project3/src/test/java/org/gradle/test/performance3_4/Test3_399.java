package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_399 {
    private final Production3_399 production = new Production3_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}