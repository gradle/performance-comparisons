package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_170 {
    private final Production81_170 production = new Production81_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}