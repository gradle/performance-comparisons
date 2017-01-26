package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_376 {
    private final Production17_376 production = new Production17_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}