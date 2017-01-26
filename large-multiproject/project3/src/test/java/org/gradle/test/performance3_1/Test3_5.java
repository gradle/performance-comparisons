package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_5 {
    private final Production3_5 production = new Production3_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}