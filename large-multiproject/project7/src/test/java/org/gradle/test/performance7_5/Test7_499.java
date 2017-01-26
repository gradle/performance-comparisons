package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_499 {
    private final Production7_499 production = new Production7_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}