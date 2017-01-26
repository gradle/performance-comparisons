package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_319 {
    private final Production81_319 production = new Production81_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}