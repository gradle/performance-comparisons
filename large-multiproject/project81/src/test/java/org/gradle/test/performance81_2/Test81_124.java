package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_124 {
    private final Production81_124 production = new Production81_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}