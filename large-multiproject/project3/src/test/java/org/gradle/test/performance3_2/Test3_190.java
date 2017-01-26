package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_190 {
    private final Production3_190 production = new Production3_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}