package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_106 {
    private final Production3_106 production = new Production3_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}