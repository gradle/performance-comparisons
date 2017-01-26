package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_283 {
    private final Production81_283 production = new Production81_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}