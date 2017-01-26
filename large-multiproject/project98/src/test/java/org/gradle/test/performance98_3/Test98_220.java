package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_220 {
    private final Production98_220 production = new Production98_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}