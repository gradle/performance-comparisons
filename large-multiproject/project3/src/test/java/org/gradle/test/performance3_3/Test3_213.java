package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_213 {
    private final Production3_213 production = new Production3_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}