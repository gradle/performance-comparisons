package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_22 {
    private final Production81_22 production = new Production81_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}