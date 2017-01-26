package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_404 {
    private final Production99_404 production = new Production99_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}