package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_110 {
    private final Production81_110 production = new Production81_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}