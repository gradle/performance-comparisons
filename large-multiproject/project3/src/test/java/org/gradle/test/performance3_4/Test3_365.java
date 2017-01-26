package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_365 {
    private final Production3_365 production = new Production3_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}