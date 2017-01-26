package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_232 {
    private final Production81_232 production = new Production81_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}