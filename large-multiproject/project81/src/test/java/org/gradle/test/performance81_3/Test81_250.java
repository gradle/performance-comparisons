package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_250 {
    private final Production81_250 production = new Production81_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}