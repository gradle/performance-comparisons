package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_408 {
    private final Production17_408 production = new Production17_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}