package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_410 {
    private final Production81_410 production = new Production81_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}