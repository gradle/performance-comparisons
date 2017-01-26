package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_193 {
    private final Production3_193 production = new Production3_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}