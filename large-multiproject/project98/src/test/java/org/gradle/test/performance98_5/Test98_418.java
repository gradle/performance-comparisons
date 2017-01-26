package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_418 {
    private final Production98_418 production = new Production98_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}