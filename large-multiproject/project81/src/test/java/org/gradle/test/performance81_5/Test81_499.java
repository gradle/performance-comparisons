package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_499 {
    private final Production81_499 production = new Production81_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}