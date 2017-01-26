package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_436 {
    private final Production81_436 production = new Production81_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}