package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_210 {
    private final Production81_210 production = new Production81_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}