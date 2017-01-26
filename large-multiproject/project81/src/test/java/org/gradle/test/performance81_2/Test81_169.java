package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_169 {
    private final Production81_169 production = new Production81_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}