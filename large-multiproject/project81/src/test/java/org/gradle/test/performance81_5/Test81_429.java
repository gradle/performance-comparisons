package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_429 {
    private final Production81_429 production = new Production81_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}