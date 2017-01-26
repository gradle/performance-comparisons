package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_265 {
    private final Production81_265 production = new Production81_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}