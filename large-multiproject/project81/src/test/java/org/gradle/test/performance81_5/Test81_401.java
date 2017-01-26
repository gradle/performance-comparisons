package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_401 {
    private final Production81_401 production = new Production81_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}