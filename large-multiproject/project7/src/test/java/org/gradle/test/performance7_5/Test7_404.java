package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_404 {
    private final Production7_404 production = new Production7_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}