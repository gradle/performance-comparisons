package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_258 {
    private final Production81_258 production = new Production81_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}