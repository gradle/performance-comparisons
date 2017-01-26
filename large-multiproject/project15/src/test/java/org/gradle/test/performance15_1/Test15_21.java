package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_21 {
    private final Production15_21 production = new Production15_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}