package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_404 {
    private final Production18_404 production = new Production18_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}