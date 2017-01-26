package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_221 {
    private final Production81_221 production = new Production81_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}