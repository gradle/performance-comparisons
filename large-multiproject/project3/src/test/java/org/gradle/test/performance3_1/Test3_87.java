package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_87 {
    private final Production3_87 production = new Production3_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}