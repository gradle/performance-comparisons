package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_344 {
    private final Production81_344 production = new Production81_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}