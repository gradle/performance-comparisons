package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_404 {
    private final Production66_404 production = new Production66_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}