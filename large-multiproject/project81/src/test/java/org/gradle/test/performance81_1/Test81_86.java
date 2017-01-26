package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_86 {
    private final Production81_86 production = new Production81_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}