package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_318 {
    private final Production81_318 production = new Production81_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}