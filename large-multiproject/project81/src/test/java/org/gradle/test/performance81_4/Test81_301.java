package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_301 {
    private final Production81_301 production = new Production81_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}