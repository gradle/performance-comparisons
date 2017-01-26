package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_56 {
    private final Production37_56 production = new Production37_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}