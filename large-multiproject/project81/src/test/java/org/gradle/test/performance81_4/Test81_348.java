package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_348 {
    private final Production81_348 production = new Production81_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}