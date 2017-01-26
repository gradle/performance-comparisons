package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_261 {
    private final Production81_261 production = new Production81_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}