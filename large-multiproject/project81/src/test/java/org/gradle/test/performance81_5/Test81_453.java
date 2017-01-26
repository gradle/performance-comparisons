package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_453 {
    private final Production81_453 production = new Production81_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}