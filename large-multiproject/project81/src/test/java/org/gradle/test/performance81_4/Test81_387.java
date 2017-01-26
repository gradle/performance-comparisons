package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_387 {
    private final Production81_387 production = new Production81_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}