package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_273 {
    private final Production81_273 production = new Production81_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}