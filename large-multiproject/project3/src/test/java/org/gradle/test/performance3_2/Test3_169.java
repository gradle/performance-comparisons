package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_169 {
    private final Production3_169 production = new Production3_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}