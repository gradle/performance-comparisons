package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_448 {
    private final Production81_448 production = new Production81_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}