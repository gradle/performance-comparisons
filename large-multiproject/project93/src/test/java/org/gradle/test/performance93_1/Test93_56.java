package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_56 {
    private final Production93_56 production = new Production93_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}