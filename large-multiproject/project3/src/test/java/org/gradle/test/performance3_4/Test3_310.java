package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_310 {
    private final Production3_310 production = new Production3_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}