package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_438 {
    private final Production81_438 production = new Production81_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}