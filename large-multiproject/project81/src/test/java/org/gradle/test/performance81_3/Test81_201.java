package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_201 {
    private final Production81_201 production = new Production81_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}