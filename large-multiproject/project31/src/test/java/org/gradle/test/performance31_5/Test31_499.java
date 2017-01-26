package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_499 {
    private final Production31_499 production = new Production31_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}