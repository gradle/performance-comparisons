package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_493 {
    private final Production81_493 production = new Production81_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}