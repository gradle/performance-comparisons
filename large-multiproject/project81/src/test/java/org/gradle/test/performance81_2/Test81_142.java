package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_142 {
    private final Production81_142 production = new Production81_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}