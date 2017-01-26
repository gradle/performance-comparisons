package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_184 {
    private final Production81_184 production = new Production81_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}