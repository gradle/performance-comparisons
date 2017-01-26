package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_457 {
    private final Production81_457 production = new Production81_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}