package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_345 {
    private final Production3_345 production = new Production3_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}