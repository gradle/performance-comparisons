package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_127 {
    private final Production81_127 production = new Production81_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}