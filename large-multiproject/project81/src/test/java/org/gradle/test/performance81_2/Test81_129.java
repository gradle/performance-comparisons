package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_129 {
    private final Production81_129 production = new Production81_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}