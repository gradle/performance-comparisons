package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_340 {
    private final Production81_340 production = new Production81_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}