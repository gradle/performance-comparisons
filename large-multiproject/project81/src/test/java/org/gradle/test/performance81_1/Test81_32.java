package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_32 {
    private final Production81_32 production = new Production81_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}