package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_404 {
    private final Production48_404 production = new Production48_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}