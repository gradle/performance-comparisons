package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_11 {
    private final Production81_11 production = new Production81_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}