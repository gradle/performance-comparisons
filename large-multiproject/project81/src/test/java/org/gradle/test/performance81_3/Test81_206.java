package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_206 {
    private final Production81_206 production = new Production81_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}