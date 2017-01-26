package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_178 {
    private final Production81_178 production = new Production81_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}