package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_81 {
    private final Production3_81 production = new Production3_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}