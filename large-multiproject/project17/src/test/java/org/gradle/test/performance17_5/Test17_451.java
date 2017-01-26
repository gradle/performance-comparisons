package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_451 {
    private final Production17_451 production = new Production17_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}