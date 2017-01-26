package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_391 {
    private final Production81_391 production = new Production81_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}