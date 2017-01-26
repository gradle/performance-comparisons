package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_21 {
    private final Production93_21 production = new Production93_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}