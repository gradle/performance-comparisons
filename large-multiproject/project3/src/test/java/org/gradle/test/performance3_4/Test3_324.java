package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_324 {
    private final Production3_324 production = new Production3_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}