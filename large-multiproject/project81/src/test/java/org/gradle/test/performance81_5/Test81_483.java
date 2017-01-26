package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_483 {
    private final Production81_483 production = new Production81_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}