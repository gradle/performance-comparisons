package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_56 {
    private final Production81_56 production = new Production81_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}