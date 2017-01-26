package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_203 {
    private final Production3_203 production = new Production3_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}