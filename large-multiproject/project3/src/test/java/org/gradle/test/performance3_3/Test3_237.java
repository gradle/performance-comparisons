package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_237 {
    private final Production3_237 production = new Production3_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}