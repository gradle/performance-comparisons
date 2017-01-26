package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_23 {
    private final Production81_23 production = new Production81_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}