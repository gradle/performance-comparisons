package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_404 {
    private final Production97_404 production = new Production97_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}