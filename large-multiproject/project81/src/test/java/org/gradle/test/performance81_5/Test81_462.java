package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_462 {
    private final Production81_462 production = new Production81_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}