package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_13 {
    private final Production81_13 production = new Production81_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}