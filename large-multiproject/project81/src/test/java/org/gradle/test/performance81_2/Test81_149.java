package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_149 {
    private final Production81_149 production = new Production81_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}