package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_379 {
    private final Production3_379 production = new Production3_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}