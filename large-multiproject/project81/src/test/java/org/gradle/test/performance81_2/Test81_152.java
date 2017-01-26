package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_152 {
    private final Production81_152 production = new Production81_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}