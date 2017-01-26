package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_404 {
    private final Production61_404 production = new Production61_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}