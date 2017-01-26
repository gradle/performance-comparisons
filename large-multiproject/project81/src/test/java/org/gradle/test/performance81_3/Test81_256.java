package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_256 {
    private final Production81_256 production = new Production81_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}