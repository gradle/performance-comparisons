package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_56 {
    private final Production58_56 production = new Production58_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}