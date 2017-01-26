package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_103 {
    private final Production81_103 production = new Production81_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}