package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_237 {
    private final Production81_237 production = new Production81_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}