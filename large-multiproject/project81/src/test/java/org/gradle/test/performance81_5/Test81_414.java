package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_414 {
    private final Production81_414 production = new Production81_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}