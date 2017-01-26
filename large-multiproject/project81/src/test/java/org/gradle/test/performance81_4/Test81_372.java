package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_372 {
    private final Production81_372 production = new Production81_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}