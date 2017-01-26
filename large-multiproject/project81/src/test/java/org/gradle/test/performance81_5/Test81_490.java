package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_490 {
    private final Production81_490 production = new Production81_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}