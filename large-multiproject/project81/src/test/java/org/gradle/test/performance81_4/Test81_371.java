package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_371 {
    private final Production81_371 production = new Production81_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}