package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_322 {
    private final Production81_322 production = new Production81_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}