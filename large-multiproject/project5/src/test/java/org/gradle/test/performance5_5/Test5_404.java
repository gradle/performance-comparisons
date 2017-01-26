package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_404 {
    private final Production5_404 production = new Production5_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}