package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_240 {
    private final Production81_240 production = new Production81_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}