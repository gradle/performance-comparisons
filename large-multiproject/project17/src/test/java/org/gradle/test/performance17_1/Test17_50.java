package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_50 {
    private final Production17_50 production = new Production17_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}