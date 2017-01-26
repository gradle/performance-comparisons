package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_381 {
    private final Production81_381 production = new Production81_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}