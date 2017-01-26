package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_376 {
    private final Production15_376 production = new Production15_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}