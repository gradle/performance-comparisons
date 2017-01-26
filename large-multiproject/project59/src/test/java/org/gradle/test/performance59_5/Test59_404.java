package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_404 {
    private final Production59_404 production = new Production59_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}