package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_402 {
    private final Production81_402 production = new Production81_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}