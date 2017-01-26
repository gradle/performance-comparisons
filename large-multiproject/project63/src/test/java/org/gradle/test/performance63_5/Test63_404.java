package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_404 {
    private final Production63_404 production = new Production63_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}