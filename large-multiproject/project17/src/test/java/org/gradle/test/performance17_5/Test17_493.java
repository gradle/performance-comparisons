package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_493 {
    private final Production17_493 production = new Production17_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}