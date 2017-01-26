package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_404 {
    private final Production22_404 production = new Production22_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}