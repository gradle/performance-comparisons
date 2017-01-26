package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_349 {
    private final Production81_349 production = new Production81_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}