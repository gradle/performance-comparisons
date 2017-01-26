package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_216 {
    private final Production3_216 production = new Production3_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}