package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_466 {
    private final Production98_466 production = new Production98_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}