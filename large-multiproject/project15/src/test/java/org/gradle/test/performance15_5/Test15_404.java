package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_404 {
    private final Production15_404 production = new Production15_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}