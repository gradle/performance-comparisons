package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_404 {
    private final Production89_404 production = new Production89_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}