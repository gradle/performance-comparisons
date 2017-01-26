package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_220 {
    private final Production3_220 production = new Production3_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}