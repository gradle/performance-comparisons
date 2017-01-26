package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_316 {
    private final Production81_316 production = new Production81_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}