package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_409 {
    private final Production81_409 production = new Production81_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}