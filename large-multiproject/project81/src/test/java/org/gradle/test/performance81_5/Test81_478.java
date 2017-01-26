package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_478 {
    private final Production81_478 production = new Production81_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}