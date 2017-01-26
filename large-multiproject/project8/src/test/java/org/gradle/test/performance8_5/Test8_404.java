package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_404 {
    private final Production8_404 production = new Production8_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}