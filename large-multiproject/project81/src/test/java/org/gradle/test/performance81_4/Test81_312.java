package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_312 {
    private final Production81_312 production = new Production81_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}