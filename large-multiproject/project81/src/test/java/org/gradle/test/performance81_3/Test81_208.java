package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_208 {
    private final Production81_208 production = new Production81_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}