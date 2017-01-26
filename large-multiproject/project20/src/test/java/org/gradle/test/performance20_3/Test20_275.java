package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_275 {
    private final Production20_275 production = new Production20_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}