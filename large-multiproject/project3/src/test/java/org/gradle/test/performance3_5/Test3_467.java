package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_467 {
    private final Production3_467 production = new Production3_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}