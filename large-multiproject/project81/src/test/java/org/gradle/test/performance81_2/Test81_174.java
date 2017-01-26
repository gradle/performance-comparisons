package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_174 {
    private final Production81_174 production = new Production81_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}