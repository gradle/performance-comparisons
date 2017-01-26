package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_404 {
    private final Production31_404 production = new Production31_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}