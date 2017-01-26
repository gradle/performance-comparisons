package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_284 {
    private final Production81_284 production = new Production81_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}