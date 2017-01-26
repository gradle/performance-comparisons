package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_7 {
    private final Production3_7 production = new Production3_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}