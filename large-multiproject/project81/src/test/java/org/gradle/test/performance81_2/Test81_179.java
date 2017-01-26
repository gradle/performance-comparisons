package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_179 {
    private final Production81_179 production = new Production81_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}