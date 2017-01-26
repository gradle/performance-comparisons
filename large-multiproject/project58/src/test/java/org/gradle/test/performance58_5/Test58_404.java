package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_404 {
    private final Production58_404 production = new Production58_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}