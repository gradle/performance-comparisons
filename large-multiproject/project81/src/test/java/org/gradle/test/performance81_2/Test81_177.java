package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_177 {
    private final Production81_177 production = new Production81_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}