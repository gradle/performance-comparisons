package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_404 {
    private final Production20_404 production = new Production20_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}