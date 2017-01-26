package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_21 {
    private final Production81_21 production = new Production81_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}