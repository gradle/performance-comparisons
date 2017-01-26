package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_122 {
    private final Production81_122 production = new Production81_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}