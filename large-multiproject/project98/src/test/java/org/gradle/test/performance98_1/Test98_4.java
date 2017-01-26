package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_4 {
    private final Production98_4 production = new Production98_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}