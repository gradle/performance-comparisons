package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_239 {
    private final Production81_239 production = new Production81_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}