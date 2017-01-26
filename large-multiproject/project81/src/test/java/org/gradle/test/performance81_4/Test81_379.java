package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_379 {
    private final Production81_379 production = new Production81_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}