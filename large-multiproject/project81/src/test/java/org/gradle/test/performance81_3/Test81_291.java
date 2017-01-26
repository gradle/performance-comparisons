package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_291 {
    private final Production81_291 production = new Production81_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}