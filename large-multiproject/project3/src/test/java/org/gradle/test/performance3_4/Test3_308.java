package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_308 {
    private final Production3_308 production = new Production3_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}