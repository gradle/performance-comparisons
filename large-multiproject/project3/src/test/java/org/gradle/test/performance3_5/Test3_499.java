package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_499 {
    private final Production3_499 production = new Production3_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}