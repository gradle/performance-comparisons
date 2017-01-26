package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_399 {
    private final Production81_399 production = new Production81_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}