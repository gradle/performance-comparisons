package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_158 {
    private final Production81_158 production = new Production81_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}