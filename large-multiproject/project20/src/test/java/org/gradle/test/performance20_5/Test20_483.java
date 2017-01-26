package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_483 {
    private final Production20_483 production = new Production20_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}