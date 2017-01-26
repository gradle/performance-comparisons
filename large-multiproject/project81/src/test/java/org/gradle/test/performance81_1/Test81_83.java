package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_83 {
    private final Production81_83 production = new Production81_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}