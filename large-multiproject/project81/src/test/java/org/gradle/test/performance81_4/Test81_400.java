package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_400 {
    private final Production81_400 production = new Production81_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}