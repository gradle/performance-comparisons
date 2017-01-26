package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_404 {
    private final Production39_404 production = new Production39_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}