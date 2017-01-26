package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_198 {
    private final Production81_198 production = new Production81_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}