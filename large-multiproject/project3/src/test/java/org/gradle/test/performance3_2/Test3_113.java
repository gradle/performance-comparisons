package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_113 {
    private final Production3_113 production = new Production3_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}