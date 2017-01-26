package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_499 {
    private final Production10_499 production = new Production10_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}