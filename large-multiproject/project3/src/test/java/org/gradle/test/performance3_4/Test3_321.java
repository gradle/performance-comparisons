package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_321 {
    private final Production3_321 production = new Production3_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}