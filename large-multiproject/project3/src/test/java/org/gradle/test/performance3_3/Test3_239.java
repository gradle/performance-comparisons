package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_239 {
    private final Production3_239 production = new Production3_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}