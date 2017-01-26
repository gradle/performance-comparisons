package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_441 {
    private final Production3_441 production = new Production3_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}