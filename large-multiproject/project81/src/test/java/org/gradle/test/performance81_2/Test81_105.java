package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_105 {
    private final Production81_105 production = new Production81_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}