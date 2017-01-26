package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_489 {
    private final Production3_489 production = new Production3_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}