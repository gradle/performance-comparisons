package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_205 {
    private final Production81_205 production = new Production81_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}