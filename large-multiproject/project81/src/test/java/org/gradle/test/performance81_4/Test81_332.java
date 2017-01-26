package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_332 {
    private final Production81_332 production = new Production81_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}