package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_500 {
    private final Production98_500 production = new Production98_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}