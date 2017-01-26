package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_404 {
    private final Production92_404 production = new Production92_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}