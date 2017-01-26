package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_12 {
    private final Production3_12 production = new Production3_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}