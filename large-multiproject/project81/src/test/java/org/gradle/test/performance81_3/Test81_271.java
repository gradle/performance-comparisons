package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_271 {
    private final Production81_271 production = new Production81_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}