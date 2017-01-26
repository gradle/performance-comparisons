package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_429 {
    private final Production17_429 production = new Production17_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}