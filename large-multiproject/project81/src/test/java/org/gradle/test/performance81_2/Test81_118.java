package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_118 {
    private final Production81_118 production = new Production81_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}