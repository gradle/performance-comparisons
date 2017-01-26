package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_412 {
    private final Production81_412 production = new Production81_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}