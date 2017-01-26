package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_132 {
    private final Production81_132 production = new Production81_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}