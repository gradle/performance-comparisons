package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_153 {
    private final Production81_153 production = new Production81_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}