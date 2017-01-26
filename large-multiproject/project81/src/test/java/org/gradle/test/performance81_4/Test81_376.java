package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_376 {
    private final Production81_376 production = new Production81_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}