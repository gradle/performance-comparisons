package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_108 {
    private final Production81_108 production = new Production81_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}