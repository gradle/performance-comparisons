package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_211 {
    private final Production71_211 production = new Production71_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}