package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_404 {
    private final Production90_404 production = new Production90_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}