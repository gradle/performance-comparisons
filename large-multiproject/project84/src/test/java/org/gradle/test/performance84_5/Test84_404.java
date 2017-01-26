package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_404 {
    private final Production84_404 production = new Production84_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}