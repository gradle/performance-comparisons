package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_448 {
    private final Production17_448 production = new Production17_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}