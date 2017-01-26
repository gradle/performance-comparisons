package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_385 {
    private final Production17_385 production = new Production17_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}