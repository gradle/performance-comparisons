package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_112 {
    private final Production98_112 production = new Production98_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}