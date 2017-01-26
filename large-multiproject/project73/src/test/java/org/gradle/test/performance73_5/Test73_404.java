package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_404 {
    private final Production73_404 production = new Production73_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}