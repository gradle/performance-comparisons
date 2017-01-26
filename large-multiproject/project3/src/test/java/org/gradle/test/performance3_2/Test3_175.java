package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_175 {
    private final Production3_175 production = new Production3_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}