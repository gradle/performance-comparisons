package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_343 {
    private final Production81_343 production = new Production81_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}