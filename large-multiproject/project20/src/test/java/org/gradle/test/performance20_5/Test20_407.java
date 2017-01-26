package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_407 {
    private final Production20_407 production = new Production20_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}