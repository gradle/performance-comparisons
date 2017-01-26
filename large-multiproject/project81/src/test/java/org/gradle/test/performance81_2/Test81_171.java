package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_171 {
    private final Production81_171 production = new Production81_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}