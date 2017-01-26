package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_131 {
    private final Production81_131 production = new Production81_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}