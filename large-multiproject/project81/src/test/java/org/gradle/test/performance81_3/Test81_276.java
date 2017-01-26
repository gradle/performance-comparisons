package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_276 {
    private final Production81_276 production = new Production81_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}