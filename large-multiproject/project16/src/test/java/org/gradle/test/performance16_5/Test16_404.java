package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_404 {
    private final Production16_404 production = new Production16_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}