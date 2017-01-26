package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_140 {
    private final Production81_140 production = new Production81_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}