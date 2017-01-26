package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_147 {
    private final Production98_147 production = new Production98_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}