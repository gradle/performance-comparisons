package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_311 {
    private final Production81_311 production = new Production81_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}