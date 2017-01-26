package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_333 {
    private final Production93_333 production = new Production93_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}