package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_104 {
    private final Production81_104 production = new Production81_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}