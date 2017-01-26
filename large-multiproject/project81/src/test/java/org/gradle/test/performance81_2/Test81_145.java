package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_145 {
    private final Production81_145 production = new Production81_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}