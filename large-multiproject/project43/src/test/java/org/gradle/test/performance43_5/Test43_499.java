package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_499 {
    private final Production43_499 production = new Production43_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}