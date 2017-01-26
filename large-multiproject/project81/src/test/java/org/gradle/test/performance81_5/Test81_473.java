package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_473 {
    private final Production81_473 production = new Production81_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}