package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_125 {
    private final Production81_125 production = new Production81_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}