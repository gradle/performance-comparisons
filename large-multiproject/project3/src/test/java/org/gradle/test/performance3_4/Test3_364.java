package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_364 {
    private final Production3_364 production = new Production3_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}