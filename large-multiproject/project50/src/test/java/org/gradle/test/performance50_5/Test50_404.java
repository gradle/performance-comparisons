package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_404 {
    private final Production50_404 production = new Production50_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}