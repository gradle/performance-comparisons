package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_223 {
    private final Production81_223 production = new Production81_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}