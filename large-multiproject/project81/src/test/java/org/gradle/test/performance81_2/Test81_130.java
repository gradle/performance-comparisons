package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_130 {
    private final Production81_130 production = new Production81_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}