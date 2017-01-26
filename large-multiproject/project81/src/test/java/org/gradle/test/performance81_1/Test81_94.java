package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_94 {
    private final Production81_94 production = new Production81_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}