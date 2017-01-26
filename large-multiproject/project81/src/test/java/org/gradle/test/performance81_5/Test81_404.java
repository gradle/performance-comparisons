package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_404 {
    private final Production81_404 production = new Production81_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}