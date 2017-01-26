package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_248 {
    private final Production81_248 production = new Production81_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}