package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_165 {
    private final Production81_165 production = new Production81_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}