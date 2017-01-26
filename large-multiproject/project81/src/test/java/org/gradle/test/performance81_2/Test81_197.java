package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_197 {
    private final Production81_197 production = new Production81_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}