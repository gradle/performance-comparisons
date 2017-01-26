package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_160 {
    private final Production81_160 production = new Production81_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}