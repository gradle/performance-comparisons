package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_404 {
    private final Production14_404 production = new Production14_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}