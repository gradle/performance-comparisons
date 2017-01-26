package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_428 {
    private final Production17_428 production = new Production17_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}