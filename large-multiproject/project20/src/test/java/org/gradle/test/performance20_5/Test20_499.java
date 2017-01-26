package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_499 {
    private final Production20_499 production = new Production20_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}