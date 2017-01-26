package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_249 {
    private final Production3_249 production = new Production3_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}